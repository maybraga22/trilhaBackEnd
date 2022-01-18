package com.trilha.back.application.ports;

import com.trilha.back.adapters.inbound.dtos.EntryDTO;
import com.trilha.back.adapters.outbound.entities.EntryEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EntryServicePort {

    List<EntryEntity> findAll();
    EntryEntity save(EntryEntity entryEntity);
    void delete(long id);
    boolean validateCategoryById(long id);
    Integer calculaMedia(Integer x, Integer y);
    Map<Long, List<Object>> returnListDTO2();
    EntryDTO mapDto(EntryEntity entry);
    EntryEntity mapEntity(EntryDTO entryDTO);
    Optional<EntryEntity> findById(Long id);
    Long idCategoryByName(String categoryName);

}
