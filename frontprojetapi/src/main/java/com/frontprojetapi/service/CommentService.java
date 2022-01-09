package com.frontprojetapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frontprojetapi.model.Comment;
import com.frontprojetapi.repository.CommentProxy;

@Service
public class CommentService {
	@Autowired
	private CommentProxy commentProxy;

	public void save(Comment comment, Integer id) {
		commentProxy.save(comment, id);
	}

}
