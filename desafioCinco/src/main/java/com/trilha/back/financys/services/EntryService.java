package com.trilha.back.financys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trilha.back.financys.entities.Entry;
import com.trilha.back.financys.entities.Category;
import com.trilha.back.financys.repositories.CategoryRepository;
import com.trilha.back.financys.repositories.EntryRepository;

@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Entry> findAll() {
		return entryRepository.findAll();
	}

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