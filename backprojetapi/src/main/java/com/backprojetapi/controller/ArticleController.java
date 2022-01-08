package com.backprojetapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backprojetapi.model.Article;
import com.backprojetapi.model.Comment;
import com.backprojetapi.service.ArticleService;

@RestController
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/articles")
	public Iterable<Article> getArticles (){
		return articleService.getArticles();
	}
	
	@GetMapping("/articles/{id}")
	public Optional<Article> getArticle (@PathVariable(name = "id") Integer id){
		return articleService.getArticle(id);
	}
	
	@DeleteMapping("/articles/{id}")
	public void deleteArticle (@PathVariable(name = "id") Integer id){
		articleService.deleteArticle(id);
	}
	
	@PostMapping("/articles")
	public Article addArticle (@RequestBody Article article) {
		return articleService.upsert(article);
	}
}
