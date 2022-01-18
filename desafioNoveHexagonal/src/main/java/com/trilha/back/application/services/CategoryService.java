package com.trilha.back.application.services;

import java.util.List;
import java.util.Optional;

import com.trilha.back.adapters.outbound.entities.CategoryEntity;

import com.trilha.back.application.ports.CategoryRepositoryPort;


public class CategoryService implements CategoryRepositoryPort {

	private CategoryRepositoryPort categoryRepositoryPort;

	public CategoryService(CategoryRepositoryPort categoryRepositoryPort) {
		this.categoryRepositoryPort = categoryRepositoryPort;
	}

	public List<CategoryEntity> findAll() {
		return categoryRepositoryPort.findAll();
	}

	public Long idCategoryByName(String categoryName) {
		CategoryEntity read = categoryRepositoryPort.findByName(categoryName);
		return read.getId();
	}

	public CategoryEntity save(CategoryEntity categoryEntity) {
		return categoryRepositoryPort.save(categoryEntity);
	}

	public Optional<CategoryEntity> findById(Long id) {
		return categoryRepositoryPort.findById(id);
	}

	@Override
	public CategoryEntity findByName(String categoryName) {
		return null;
	}

	@Override
	public void deleteById(Long id) {

	}

	public void delete(Long id) {
		categoryRepositoryPort.deleteById(id);
	}

}
