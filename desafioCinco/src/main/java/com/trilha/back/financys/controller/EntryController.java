package com.trilha.back.financys.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

import com.trilha.back.financys.entities.Entry;
import com.trilha.back.financys.repositories.EntryRepository;
import com.trilha.back.financys.services.CategoryService;
import com.trilha.back.financys.services.EntryService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/entry")
public class EntryController {

	@Autowired
	private EntryService entryService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private EntryRepository entryRepository;

	@GetMapping
	public ResponseEntity<List<Entry>> findAll() {
		List<Entry> list = entryService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/category/{categoryName}")
	public ResponseEntity<?> findByName(@PathVariable String categoryName) {
		Long category = categoryService.idCategoryByName(categoryName);
		return ResponseEntity.ok(category);
	}

	@GetMapping("/readEntry/{id}")
	@ApiOperation(value = "Show the Entry by Id")
	public Optional<Entry> EntryById(@PathVariable Long id) {
		return entryService.findById(id);
	}

	@GetMapping("/paid")
	@ApiOperation(value = "Paid entries")
	public List<Entry> getPaid() {
		List<Entry> paidList = entryService.findAll();
		return paidList.stream().filter(list1 -> list1.isPaid() == true).collect(Collectors.toList());
	}

	@GetMapping("/unpaid")
	@ApiOperation(value = "Unpaid entries")
	public List<Entry> getNoPaid() {
		List<Entry> paidList = entryService.findAll();
		return paidList.stream().filter(list1 -> list1.isPaid() == false).collect(Collectors.toList());
	}
	
	
	@PostMapping("/createEntry")
	@ApiOperation(value = "Create a Entry")
	public ResponseEntity<Entry> createEntry(@RequestBody Entry entry) {
		boolean categoryExist = entryService.validateCategoryById(entry.getCategoryId());
		if (categoryExist == true) {
			Entry saveEntry = entryRepository.save(entry);
			return ResponseEntity.ok(saveEntry);
		} else {
			return ResponseEntity.notFound().build();		}
	}
	
	/*
	@PostMapping("/createEntry")
	@ApiOperation(value = "Create a Entry")
	public Entry entryCreate(@RequestBody Entry entry) {
		boolean categoryExist = entryService.validateCategoryById(entry.getCategoryId());
		if (categoryExist == false) {
			System.out.println("Category not found!");
		}
		return entryRepository.save(entry);
	}
	*/

	@PutMapping("/putEntry/{id}")
	@ApiOperation(value = "Update the Entry")
	public ResponseEntity<Entry> updateEntry(@PathVariable("id") Long id, @RequestBody Entry entry) {
		Optional<Entry> entryData = entryService.findById(id);
		if (entryData.isPresent()) {
			Entry ent1 = entryData.get();
			ent1.setName(entry.getName());
			ent1.setDescription(entry.getDescription());
			return new ResponseEntity<>(entryService.save(ent1), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteEntry/{id}")
	@ApiOperation(value = "Delete the Entry by Id")
	public void deleteEntry(@PathVariable Long id) {
		entryRepository.deleteById(id);
	}
}