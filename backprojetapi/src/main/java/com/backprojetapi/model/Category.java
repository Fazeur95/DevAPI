package com.backprojetapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Integer category_id;
	private String name;

	@ManyToMany(
			fetch = FetchType.LAZY, // performance
			cascade = { 
					CascadeType.PERSIST, // création
					CascadeType.MERGE }) // modification
	@JoinTable(
			// nom de la table de jointure
			name = "category_article",  
			// clé étrangère dans la table de jointure correspondant à la clé primaire 
			// de la classe courante (category)
			joinColumns = @JoinColumn(name = "category_id"), 
			// clé étrangère dans la table de jointure correspondant à la clé primaire
			// de la classe en relation (product)
			inverseJoinColumns = @JoinColumn(name = "article_id"))
	private List<Article> articles = new ArrayList<>();

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
