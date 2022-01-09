package com.frontprojetapi.repository;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.frontprojetapi.model.Comment;

@Component
public class CommentProxy {
	
	public void save(Comment comment, Integer id) {
		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<Comment> request = new HttpEntity<Comment>(comment);

		restTemplate.exchange("http://localhost:8000" + "/articles/" + id + "/comment", HttpMethod.POST, request, Comment.class);
	}
}
