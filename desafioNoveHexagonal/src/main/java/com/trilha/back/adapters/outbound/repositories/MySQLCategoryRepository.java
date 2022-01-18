package com.trilha.back.adapters.outbound.repositories;

import com.trilha.back.adapters.configuration.ModelMapperConfig;
import com.trilha.back.adapters.outbound.entities.CategoryEntity;
import com.trilha.back.application.ports.CategoryRepositoryPort;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Primary
public class MySQLCategoryRepository implements CategoryRepositoryPort {

    private CategoryRepository categoryRepository;

    public MySQLCategoryRepository(CategoryRepository categoryRepository, ModelMapperConfig modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }
    final
    ModelMapperConfig modelMapper;

    @Override
    public List<CategoryEntity> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity save(CategoryEntity category) {
        return categoryRepository.save(category);
    }

    @Override
    public Optional<CategoryEntity> findById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public CategoryEntity findByName(String categoryName) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
