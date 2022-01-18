package com.trilha.back.application.ports;

import com.trilha.back.adapters.outbound.entities.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryRepositoryPort {
    List<CategoryEntity> findAll();
    CategoryEntity save(CategoryEntity category);
    Optional<CategoryEntity> findById(Long categoryId);
    CategoryEntity findByName(String categoryName);
    void deleteById(Long id);
    void delete(Long id);

}
