package com.trilha.back.financys.services;

import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trilha.back.financys.entities.Entry;
import com.trilha.back.financys.dto.EntryDTO;
import com.trilha.back.financys.entities.Category;
import com.trilha.back.financys.repositories.CategoryRepository;
import com.trilha.back.financys.repositories.EntryRepository;

@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ModelMapper modelMapper;

	public List<Entry> findAll() {
		return entryRepository.findAll();
	}

	public EntryDTO mapDto(Entry entry) {
		EntryDTO entryDTO = modelMapper.map(entry, EntryDTO.class);
		return entryDTO;
	}

	public Entry mapEntity(EntryDTO entryDTO) {
		Entry entry = modelMapper.map(entryDTO, Entry.class);
		return entry;
	}
	
	private List<EntryDTO> chartList = new ArrayList<EntryDTO>();
	
	public Map<Long, List<EntryDTO>> retornDTOList() {
		entryRepository.findAll().stream().forEach(listDTO -> chartList.add(mapDto(listDTO)));
		Map<Long, List<EntryDTO>> grouped = chartList.stream().collect(Collectors.groupingBy(EntryDTO::getCategoryId));
		return grouped;
	}
	
	public Map<Long, List<Entry>> listByCategory() {
		List<Entry> list = entryRepository.findAll();
		Map<Long, List<Entry>> listByCategory = list.stream().collect(Collectors.groupingBy(Entry::getCategoryId));
		return listByCategory;
	}
	
	/*
	public List <EntryDTO> returnListDTO2(){
		List<Entry> listEntry = entryRepository.findAll();
		List<EntryDTO> listDTO = new ArrayList<EntryDTO>();
	
		listEntry.forEach(entry -> listDTO.stream()
				.collect(Collectors.groupingBy(Entry::getName)));
	} */
		
	public boolean validateCategoryById(long id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.isPresent();
	}

	public Entry save(Entry entry) {
		return entryRepository.save(entry);
	}

	public Optional<Entry> findById(Long id) {
		return entryRepository.findById(id);
	}

	public void delete(Long id) {
		entryRepository.deleteById(id);
	}
}