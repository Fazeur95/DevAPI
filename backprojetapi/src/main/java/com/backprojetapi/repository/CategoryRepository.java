package com.backprojetapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backprojetapi.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
