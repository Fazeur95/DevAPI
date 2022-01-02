package com.backprojetapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backprojetapi.model.Category;
import com.backprojetapi.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired CategoryRepository categoryRepository;
	
	public Iterable<Category> getCategories(){
		return categoryRepository.findAll();
	}

}
