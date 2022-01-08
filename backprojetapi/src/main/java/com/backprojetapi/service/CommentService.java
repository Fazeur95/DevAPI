package com.backprojetapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backprojetapi.model.Article;
import com.backprojetapi.model.Comment;
import com.backprojetapi.repository.ArticleRepository;
import com.backprojetapi.repository.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
	public Comment addComment(Integer id, Comment comment) {
		Article article = articleRepository.findById(id).get();
		comment.setArticle(article);
		return commentRepository.save(comment);
	}
}
