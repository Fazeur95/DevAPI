package com.frontprojetapi.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.frontprojetapi.model.Article;
@Component
public class ArticleProxy {
	public List<Article> getArticles() {

		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<List<Article>> response = restTemplate.exchange("http://localhost:8000/articles", HttpMethod.GET, entity, new ParameterizedTypeReference<List<Article>>() {
				});
		return response.getBody();
	}
	
	public Article getArticleById(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResponseEntity<Article> response =
				restTemplate.exchange(
						"http://localhost:8000" + "/articles/" + id, 
						HttpMethod.GET, 
						entity, 
						Article.class);
		return response.getBody();
	}
}
