package com.frontprojetapi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.frontprojetapi.model.Article;
import com.frontprojetapi.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/articles")
	public String articlesPage(Model model) {
		List<Article> articles = articleService.getArticles();
		model.addAttribute("articles", articles);
		return "articles";
	}
	
	@GetMapping("/articles/{id}")
	public String articleDetail(Model model, @PathVariable(name = "id")Integer id) {
		Article article = articleService.getArticleById(id);
		model.addAttribute("article", article);
		return "article";
	}
}
