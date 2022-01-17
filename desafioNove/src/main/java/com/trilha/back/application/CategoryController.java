package com.trilha.back.application;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RestController;

import com.trilha.back.domain.Category;
import com.trilha.back.domain.CategoryService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/category")
public class CategoryController {

	//teste
	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/readEntry/{id}")
	@ApiOperation(value = "Show the Entry by Id")
	public ResponseEntity<Category> EntryById(@PathVariable Long id) {
		Category read = categoryService.findById(id).get();
		return ResponseEntity.ok(read);
	}

	@PostMapping
	@ApiOperation(value = "Create a Category")
	public ResponseEntity<Category> createCategory(@Valid @RequestBody Category category) {
		Category create = categoryService.save(category);
		return ResponseEntity.ok(create);
	}

	@PutMapping("/putCategory/{id}")
	@ApiOperation(value = "Update the Category")
	public ResponseEntity<Category> updateCategory(@Valid @PathVariable("id") Long id, @RequestBody Category category) {
		Optional<Category> categoryData = categoryService.findById(id);
		if (categoryData.isPresent()) {
			Category category1 = categoryData.get();
			category1.setName(category.getName());
			category1.setDescription(category.getDescription());
			return new ResponseEntity<>(categoryService.save(category1), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteCategory/{id}")
	@ApiOperation(value = "Delete the Category by Id")
	public ResponseEntity<?> deleteCategory(@PathVariable Long id) {
		categoryService.delete(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}