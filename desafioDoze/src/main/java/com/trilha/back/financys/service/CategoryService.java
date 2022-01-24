package com.trilha.back.financys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trilha.back.financys.entities.Category;
import com.trilha.back.financys.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public Long idCategoryByName(String categoryName) {
		Category read = categoryRepository.findByName(categoryName);
		return read.getId();
	}

	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id);
	}

	public void delete(Long id) {
		categoryRepository.deleteById(id);
	}

}
