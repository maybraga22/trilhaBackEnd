package com.trilha.back.application.ports;

import com.trilha.back.adapters.outbound.entities.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryServicePort {
    CategoryEntity save(CategoryEntity category);
    Optional<CategoryEntity> findById(Long id);
    void delete(Long id);
    List<CategoryEntity> findAll();
    Long idCategoryByName(String categoryName);
}
