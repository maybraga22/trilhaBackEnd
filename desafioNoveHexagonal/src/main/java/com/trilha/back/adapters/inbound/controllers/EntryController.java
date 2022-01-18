package com.trilha.back.adapters.inbound.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.trilha.back.application.ports.CategoryServicePort;
import com.trilha.back.application.ports.EntryServicePort;
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

import com.trilha.back.adapters.outbound.entities.EntryEntity;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/entry")
public class EntryController {

	private EntryServicePort entryServicePort;

	/*
	public EntryController(EntryServicePort entryServicePort) {
		this.entryServicePort = entryServicePort;
	} */

	public EntryController(EntryServicePort entryServicePort) {
		this.entryServicePort = entryServicePort;
	}

	@GetMapping("/calculate/{x}/{y}")
	public ResponseEntity<Integer> calculaMedia(@PathVariable Integer x, @PathVariable Integer y) {
		return ResponseEntity.ok(entryServicePort.calculaMedia(x, y));
	}

	@GetMapping("/readDTO")
	public Map<Long, List<Object>> showEntryByCategory() {
		return entryServicePort.returnListDTO2();
	}

	@GetMapping
	public ResponseEntity<List<EntryEntity>> findAll() {
		List<EntryEntity> list = entryServicePort.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/category/{categoryName}")
	public ResponseEntity<?> findByName(@PathVariable String categoryName) {
		Long category = entryServicePort.idCategoryByName(categoryName);
		return ResponseEntity.ok(category);
	}

	@GetMapping("/readEntry/{id}")
	@ApiOperation(value = "Show the Entry by Id")
	public ResponseEntity<EntryEntity> EntryById(@PathVariable Long id) {
		EntryEntity read = entryServicePort.findById(id).get();
		return ResponseEntity.ok(read);
	}

	@GetMapping("/paid")
	@ApiOperation(value = "Paid entries")
	public ResponseEntity<List<EntryEntity>> getPaid() {
		List<EntryEntity> paidList = entryServicePort.findAll();
		paidList.stream().filter(list1 -> list1.isPaid() == true).collect(Collectors.toList());
		return ResponseEntity.ok(paidList);
	}

	@GetMapping("/unpaid")
	@ApiOperation(value = "Unpaid entries")
	public ResponseEntity<List<EntryEntity>> getNoPaid() {
		List<EntryEntity> unpaidList = entryServicePort.findAll();
		unpaidList.stream().filter(list1 -> list1.isPaid() == false).collect(Collectors.toList());
		return ResponseEntity.ok(unpaidList);
	}


	@PostMapping("/createEntry")
	@ApiOperation(value = "Create a Entry")
	public ResponseEntity<EntryEntity> createEntry(@Valid @RequestBody EntryEntity entryEntity) {
		boolean categoryExist = entryServicePort.validateCategoryById(entryEntity.getCategoryId());
		if (categoryExist == true) {
			EntryEntity saveEntry = entryServicePort.save(entryEntity);
			return ResponseEntity.ok(saveEntry);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/putEntry/{id}")
	@ApiOperation(value = "Update the Entry")
	public ResponseEntity<EntryEntity> updateEntry(@Valid @PathVariable("id") Long id, @RequestBody EntryEntity entryEntity) {
		Optional<EntryEntity> entryData = entryServicePort.findById(id);
		if (entryData.isPresent()) {
			EntryEntity entry1 = entryData.get();
			entry1.setName(entryEntity.getName());
			entry1.setDescription(entryEntity.getDescription());
			return new ResponseEntity<>(entryServicePort.save(entry1), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteEntry/{id}")
	@ApiOperation(value = "Delete the Entry by Id")
	public ResponseEntity<?> deleteEntry(@PathVariable Long id) {
		entryServicePort.delete(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}