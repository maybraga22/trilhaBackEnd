package com.trilha.back.financys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.trilha.back.financys.entities.Category;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/category")
public class CategoryController {
	


	private List<Category> list = new ArrayList<Category>();
	
	@PostMapping(" ")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Create Category List")
	public int create (@RequestBody Category category){
		list.add(category);
		return list.indexOf(category);
		} 	
	
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Return Category List")
	@GetMapping("/list")
	public List <Category> read(){
		return list;
	}

	
}