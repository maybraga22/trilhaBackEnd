package com.trilha.back.financys.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trilha.back.financys.entities.Category;
import com.trilha.back.financys.entities.Entry;
import com.trilha.back.financys.repositories.CategoryRepository;
import com.trilha.back.financys.repositories.EntryRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/entry")
public class EntryController {

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping("/readAllCategory")
	@ApiOperation(value = "Show all Entries")
	public List<Entry> getAllEntry() {
		return entryRepository.findAll();
	}

	@GetMapping("/readEntry/{id}")
	@ApiOperation(value = "Show the Entry by Id")
	public Entry getEntryById(@PathVariable Long id) {
		return entryRepository.findById(id).get();
	}

	@PostMapping("/createEntry/")
	@ApiOperation(value = "Create a Entry")
	public ResponseEntity<Entry> entryCreate(@RequestBody Entry entry) {
		Optional<Category> category = categoryRepository.findById(entry.getCategoryId());
		if (category.isPresent()) {
			Entry entryCreate = entryRepository.save(entry);
			return ResponseEntity.ok(entryCreate);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/putCategory/{id}")
	@ApiOperation(value = "Update the Category")
	public ResponseEntity<Entry> updateEmployee(@PathVariable("id") Long id, @RequestBody Entry entry) {
		entry.setId(id);
		entryRepository.save(entry);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@DeleteMapping("/deleteEntry/{id}")
	@ApiOperation(value = "Delete the Entry by Id")
	public void deleteEntry(@PathVariable Long id) {
		entryRepository.deleteById(id);
	}
}
