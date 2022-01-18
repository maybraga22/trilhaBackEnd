package com.trilha.back.application.ports;

import com.trilha.back.adapters.inbound.dtos.EntryDTO;
import com.trilha.back.adapters.outbound.entities.EntryEntity;

import java.util.List;
import java.util.Map;

public interface EntryRepositoryPort {
    List<EntryEntity> findAll();
    EntryEntity save(EntryEntity entryEntity);
    void delete(long entryIid);
    boolean validateCategoryById(long idCategory);
    Integer calculaMedia(Integer x, Integer y);
    Map<Long, List<Object>> returnListDTO2();
    EntryDTO mapDto(EntryEntity entry);
    EntryEntity mapEntity(EntryDTO entryDTO);
}

