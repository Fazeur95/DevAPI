package com.backprojetapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backprojetapi.model.Article;
import com.backprojetapi.model.Comment;
import com.backprojetapi.repository.ArticleRepository;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository articleRepository;
	
	public Iterable<Article> getArticles() {
		return articleRepository.findAll();
	}
	
	public Article upsert(Article article) {
		return articleRepository.save(article);
	}
	
	public Optional<Article> getArticle(Integer id) {
		return articleRepository.findById(id);
	}
	
	public void deleteArticle(Integer id) {
		articleRepository.deleteById(id);
	}
	
	public Article addComment(Article article, Comment comment) {
		article.getComments().add(comment);
		return articleRepository.save(article);
	}
}
