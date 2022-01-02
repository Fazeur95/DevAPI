package com.backprojetapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backprojetapi.model.Category;
import com.backprojetapi.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired CategoryService categoryService;
	
	@GetMapping("/categories")
	public Iterable<Category> getCategories(){
		return categoryService.getCategories();
	}
}
