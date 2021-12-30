package com.trilha.back.financys.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.trilha.back.financys.entities.Entry;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/entry")
public class EntryController {

	private List<Entry> list = new ArrayList<Entry>();

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Create Entry")
	public int create(@RequestBody Entry entry) {
		list.add(entry);
		return list.indexOf(entry);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Order Date List Entry")
	public List<Entry> read() {
		sortDates(list);
		return list;
	}

	private static void sortDates(List<Entry> list) {
		list.sort(Comparator.comparing(Entry::getDate));
	}
}
