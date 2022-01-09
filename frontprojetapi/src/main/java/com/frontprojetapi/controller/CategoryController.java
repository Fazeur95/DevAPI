package com.frontprojetapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.frontprojetapi.model.Category;
import com.frontprojetapi.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/categories")
	public String getCategories(Model model) {
		List<Category> categories = categoryService.getCategories();

		model.addAttribute("categories", categories);
		return "categories";
	}

	@GetMapping("/categories/{id}")
	public String getArticlesByCategory(Model model, @PathVariable(name = "id") Integer id) {
		Category category = categoryService.getCategoryById(id);

		model.addAttribute("category", category);
		return "category";
	}

}
