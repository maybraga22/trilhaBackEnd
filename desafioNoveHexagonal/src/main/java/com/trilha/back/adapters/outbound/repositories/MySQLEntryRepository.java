package com.trilha.back.adapters.outbound.repositories;

import com.trilha.back.adapters.inbound.dtos.EntryDTO;
import com.trilha.back.adapters.outbound.entities.EntryEntity;
import com.trilha.back.application.ports.EntryRepositoryPort;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
@Primary
public class MySQLEntryRepository implements EntryRepositoryPort {

    private EntryRepository entryRepository;

    public MySQLEntryRepository(EntryRepository entryRepository){
        this.entryRepository = entryRepository;
    }

    @Override
    public List<EntryEntity> findAll() {
        return null;
    }

    @Override
    public EntryEntity save(EntryEntity entry) {
        return entryRepository.save(entry);
    }

    @Override
    public void delete(long entryIid) {
    }

    @Override
    public boolean validateCategoryById(long idCategory) {
        return false;
    }

    @Override
    public Integer calculaMedia(Integer x, Integer y) {
        return null;
    }

    @Override
    public Map<Long, List<Object>> returnListDTO2() {
        return null;
    }

    @Override
    public EntryDTO mapDto(EntryEntity entry) {
        return null;
    }

    @Override
    public EntryEntity mapEntity(EntryDTO entryDTO) {
        return null;
    }


