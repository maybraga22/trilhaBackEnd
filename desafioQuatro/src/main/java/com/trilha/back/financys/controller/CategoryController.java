package com.trilha.back.financys.controller;

import java.util.List;

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
import com.trilha.back.financys.repositories.CategoryRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping
	@ApiOperation(value = "Show all Categories")
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	@GetMapping("/readCategory/{id}")
	@ApiOperation(value = "Show the category by Id")
	public Category getCategoryById(@PathVariable Long id) {
		return categoryRepository.findById(id).get();
	}

	@PostMapping
	@ApiOperation(value = "Create a Category")
	public Category createCategory(@RequestBody Category category) {
		return categoryRepository.save(category);
	}

	@PutMapping("/putCategory/{id}")
	@ApiOperation(value = "Update the Category")
	public ResponseEntity<Category> updateEmployee(@PathVariable("id") Long id, @RequestBody Category category) {
		category.setId(id);
		categoryRepository.save(category);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@DeleteMapping("/deleteCategory/{id}")
	@ApiOperation(value = "Delete the Category by Id")
	public void deleteCategory(@PathVariable Long id) {
		categoryRepository.deleteById(id);
	}
}
