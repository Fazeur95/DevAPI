package com.frontprojetapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frontprojetapi.model.Category;
import com.frontprojetapi.repository.CategoryProxy;

@Service
public class CategoryService {
	@Autowired
	private CategoryProxy categoryProxy;

	public List<Category> getCategories() {
		return categoryProxy.getCategories();
	}
	
	public Category getCategoryById(Integer id) {
		return categoryProxy.getCategoryById(id);
	}

}
