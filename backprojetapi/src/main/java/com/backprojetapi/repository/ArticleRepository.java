package com.backprojetapi.repository;

import org.springframework.stereotype.Repository;

import com.backprojetapi.model.Article;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
}
