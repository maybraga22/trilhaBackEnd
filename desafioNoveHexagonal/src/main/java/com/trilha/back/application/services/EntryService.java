package com.trilha.back.application.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.trilha.back.adapters.configuration.ModelMapperConfig;
import com.trilha.back.application.exception.ErrorResponse;
import com.trilha.back.adapters.outbound.entities.CategoryEntity;
import com.trilha.back.adapters.outbound.entities.EntryEntity;
import com.trilha.back.application.ports.EntryRepositoryPort;

import com.trilha.back.adapters.inbound.dtos.EntryDTO;
import com.trilha.back.application.ports.EntryServicePort;

public class EntryService implements EntryServicePort {

	private EntryRepositoryPort entryRepositoryPort;

	private ModelMapperConfig modelMapper;

	public EntryService(EntryRepositoryPort entryRepositoryPort) {
		this.entryRepositoryPort = entryRepositoryPort;
	}

	public List<EntryEntity> findAll() {
		return entryRepositoryPort.findAll();
	}

	public Integer calculaMedia(Integer x, Integer y) {
		try {
			return (x / y);
		} catch (ArithmeticException e) {
			throw new ErrorResponse.DivisionZeroException("You can't divide by zero.");

		}
	}

	public EntryDTO mapDto(EntryEntity entryEntity) {
		EntryDTO entryDTO = modelMapper.map(entryEntity, EntryDTO.class);
		return entryDTO;
	}

	public EntryEntity mapEntity(EntryDTO entryDTO) {
		EntryEntity entry = modelMapper.map(entryDTO, EntryEntity.class);
		return entry;
	}

	public Map<Long, List<Object>> returnListDTO2() {
		List<EntryEntity> listEntry = entryRepositoryPort.findAll();

		Map<Long, List<Object>> grouped = listEntry.stream().collect(
				Collectors.groupingBy(EntryEntity::getCategoryId, Collectors.mapping(p -> mapDto(p), Collectors.toList())));
		return grouped;
	}

	public boolean validateCategoryById(long id) {
		Optional<CategoryEntity> category = entryRepositoryPort.findById(id);
		return category.isPresent();
	}

	public EntryEntity save(EntryEntity entryEntity) {
		return entryRepositoryPort.save(entryEntity);
	}

	public Optional<EntryEntity> findById(Long id) {
		return entryRepositoryPort.findById(id);
	}

	@Override
	public Long idCategoryByName(String categoryName) {
		return null;
	}

	public void delete(Long id) {
		entryRepositoryPort.deleteById(id);
	}
}