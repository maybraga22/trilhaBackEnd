package com.trilha.back.financys.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trilha.back.financys.entities.Entry;
import com.trilha.back.financys.exceptions.EntryNotFoundException;
import com.trilha.back.financys.exceptions.NullPointerException;
import com.trilha.back.financys.repositories.EntryRepository;
import com.trilha.back.financys.service.CategoryService;
import com.trilha.back.financys.service.EntryService;

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
	
	@GetMapping("/filter")
	public ResponseEntity<Object> getEntryDependency (
			@RequestParam(value="date", required = false) String date,
			@RequestParam(value="amount", required = false) String amount,
			@RequestParam(value="paid", required = false) Double paid)
		throws EntryNotFoundException, NullPointerException {
		return new ResponseEntity<>(entryService.getEntryDependency(date, amount, false), HttpStatus.OK);
	}
	

	@GetMapping("/calculate/{x}/{y}")
	public ResponseEntity<Integer> calclulaMedia(@PathVariable Integer x, @PathVariable Integer y) {
		return ResponseEntity.ok(entryService.calculaMedia(x, y));
	}

	@GetMapping("/readDTO")
	public Map<Long, List<Object>> showEntryByCategory() {
		return entryService.returnListDTO2();
	}

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
	public ResponseEntity<Entry> EntryById(@PathVariable Long id) {
		Entry read = entryService.findById(id).get();
		return ResponseEntity.ok(read);
	}

	@GetMapping("/paid")
	@ApiOperation(value = "Paid entries")
	public ResponseEntity<List<Entry>> getPaid() {
		List<Entry> paidList = entryService.findAll();
		paidList.stream().filter(list1 -> list1.isPaid() == true).collect(Collectors.toList());
		return ResponseEntity.ok(paidList);
	}

	@GetMapping("/unpaid")
	@ApiOperation(value = "Unpaid entries")
	public ResponseEntity<List<Entry>> getNoPaid() {
		List<Entry> unpaidList = entryService.findAll();
		unpaidList.stream().filter(list1 -> list1.isPaid() == false).collect(Collectors.toList());
		return ResponseEntity.ok(unpaidList);
	}

	@PostMapping("/createEntry")
	@ApiOperation(value = "Create a Entry")
	public ResponseEntity<Entry> createEntry(@Valid @RequestBody Entry entry) {
		boolean categoryExist = entryService.validateCategoryById(entry.getCategoryId());
		if (categoryExist == true) {
			Entry saveEntry = entryRepository.save(entry);
			return ResponseEntity.ok(saveEntry);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/putEntry/{id}")
	@ApiOperation(value = "Update the Entry")
	public ResponseEntity<Entry> updateEntry(@Valid @PathVariable("id") Long id, @RequestBody Entry entry) {
		Optional<Entry> entryData = entryService.findById(id);
		if (entryData.isPresent()) {
			Entry entry1 = entryData.get();
			entry1.setName(entry.getName());
			entry1.setDescription(entry.getDescription());
			return new ResponseEntity<>(entryService.save(entry1), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteEntry/{id}")
	@ApiOperation(value = "Delete the Entry by Id")
	public ResponseEntity<?> deleteEntry(@PathVariable Long id) {
		entryService.delete(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}