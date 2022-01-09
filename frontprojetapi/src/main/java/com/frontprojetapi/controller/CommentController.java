package com.frontprojetapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frontprojetapi.model.Comment;
import com.frontprojetapi.service.CommentService;

@Controller
public class CommentController {
	@Autowired
	private CommentService commentService;

	@PostMapping("/articles/{id}/comment")
	public ModelAndView addComment(@ModelAttribute Comment comment, @PathVariable(name = "id") Integer id) {
		commentService.save(comment, id);
		return new ModelAndView("redirect:/articles/" + id);
	}

}
