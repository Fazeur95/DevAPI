package com.backprojetapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backprojetapi.model.Comment;
import com.backprojetapi.service.CommentService;

@RestController
public class CommentController {

	@Autowired 
	private CommentService commentService;
	
	@PostMapping("/articles/{id}/comment")
	public Comment addComment(@PathVariable(name = "id")Integer id, @RequestBody Comment comment) {
		return commentService.addComment(id, comment);
	}
}
