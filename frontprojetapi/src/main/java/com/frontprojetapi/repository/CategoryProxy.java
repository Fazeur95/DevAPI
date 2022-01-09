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

import com.frontprojetapi.model.Category;

@Component
public class CategoryProxy {
	public List<Category> getCategories() {

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<List<Category>> response = restTemplate.exchange("http://localhost:8000/categories",
				HttpMethod.GET, entity, new ParameterizedTypeReference<List<Category>>() {
				});
		return response.getBody();
	}
	
	public Category getCategoryById(Integer id) {

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<Category> response = restTemplate.exchange("http://localhost:8000/categories/" + id ,
				HttpMethod.GET, entity, new ParameterizedTypeReference<Category>() {
				});
		return response.getBody();
	}

}
