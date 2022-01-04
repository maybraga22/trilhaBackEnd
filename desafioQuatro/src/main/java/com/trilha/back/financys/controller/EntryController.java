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
	public Optional<Entry> EntryById(@PathVariable Long id) {
		return entryRepository.findById(id);
	}

	@GetMapping("/entry/paid")
	@ApiOperation(value = "Paid entries")
	public List<Entry> getPaid(){
		List<Entry> paidList = entryRepository.findAll();
		return paidList.stream().filter(list1 -> list1.isPaid() == true).collect(Collectors.toList());
	}
	
	@GetMapping("/entry/noPaid")
	@ApiOperation(value = "Unpaid entries")
	public List<Entry> getNoPaid(){
		List<Entry> paidList = entryRepository.findAll();
		return paidList.stream().filter(list1 -> list1.isPaid() == false).collect(Collectors.toList());
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

	@PutMapping("/putEntry/{id}")
	@ApiOperation(value = "Update the Entry")
	public ResponseEntity<Entry> updateEntry(@PathVariable("id") Long id, @RequestBody Entry entry) {
		Optional<Entry> entryData = entryRepository.findById(id);
		if (entryData.isPresent()) {
			Entry ent1 = entryData.get();
			ent1.setName(entry.getName());
			ent1.setDescription(entry.getDescription());
			return new ResponseEntity<>(entryRepository.save(ent1), HttpStatus.OK);
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
