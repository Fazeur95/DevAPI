package com.frontprojetapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frontprojetapi.model.Article;
import com.frontprojetapi.repository.ArticleProxy;

@Service
public class ArticleService {
	@Autowired 
	private ArticleProxy articleProxy;
	
	public List<Article> getArticles(){
		return articleProxy.getArticles();
	}
	
	public Article getArticleById(Integer id) {
		return articleProxy.getArticleById(id);
	}
}
