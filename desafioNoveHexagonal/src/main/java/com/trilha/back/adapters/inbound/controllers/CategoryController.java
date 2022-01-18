package com.trilha.back.adapters.inbound.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.trilha.back.application.ports.CategoryServicePort;
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

import com.trilha.back.adapters.outbound.entities.CategoryEntity;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/category")
public class CategoryController {

	private final CategoryServicePort categoryServicePort;

	public CategoryController(CategoryServicePort categoryServicePort) {
		this.categoryServicePort = categoryServicePort;
	}

	@GetMapping
	public ResponseEntity<List<CategoryEntity>> findAll() {
		List<CategoryEntity> list = categoryServicePort.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/readEntry/{id}")
	@ApiOperation(value = "Show the Entry by Id")
	public ResponseEntity<CategoryEntity> EntryById(@PathVariable Long id) {
		CategoryEntity read = categoryServicePort.findById(id).get();
		return ResponseEntity.ok(read);
	}

	@PostMapping
	@ApiOperation(value = "Create a Category")
	public ResponseEntity<CategoryEntity> createCategory(@Valid @RequestBody CategoryEntity category) {
		CategoryEntity create = categoryServicePort.save(category);
		return ResponseEntity.ok(create);
	}

	@PutMapping("/putCategory/{id}")
	@ApiOperation(value = "Update the Category")
	public ResponseEntity<CategoryEntity> updateCategory(@Valid @PathVariable("id") Long id, @RequestBody CategoryEntity category) {
		Optional<CategoryEntity> categoryData = categoryServicePort.findById(id);
		if (categoryData.isPresent()) {
			CategoryEntity category1 = categoryData.get();
			category1.setName(category.getName());
			category1.setDescription(category.getDescription());
			return new ResponseEntity<>(categoryServicePort.save(category1), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteCategory/{id}")
	@ApiOperation(value = "Delete the Category by Id")
	public ResponseEntity<?> deleteCategory(@PathVariable Long id) {
		categoryServicePort.delete(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}