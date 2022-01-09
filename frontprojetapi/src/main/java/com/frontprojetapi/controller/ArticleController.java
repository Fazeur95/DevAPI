package com.frontprojetapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frontprojetapi.model.Article;
import com.frontprojetapi.model.Category;
import com.frontprojetapi.model.Comment;
import com.frontprojetapi.service.ArticleService;
import com.frontprojetapi.service.CategoryService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/articles")
	public String articlesPage(Model model) {
		List<Article> articles = articleService.getArticles();

		model.addAttribute("articles", articles);

		return "articles";
	}

	@GetMapping("/articles/{id}")
	public String articleDetail(Model model, @PathVariable(name = "id") Integer id) {
		Article article = articleService.getArticleById(id);
		model.addAttribute("article", article);
		model.addAttribute("comment", new Comment());
		return "article";
	}

	@GetMapping("/articles/new")
	public String newArticlePage(Model model) {
		List<Category> categories = categoryService.getCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("article", new Article());
		return "newArticle";
	}

	@PostMapping("/articles")
	public ModelAndView createNewArticle(@ModelAttribute Article article) {
		articleService.save(article);
		return new ModelAndView("redirect:/articles");
	}
}
