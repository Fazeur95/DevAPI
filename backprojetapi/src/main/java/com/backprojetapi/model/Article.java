package com.backprojetapi.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "articles")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "article_id")
	private Integer id;
	private String title;
	private String content;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date date;
	private Integer id_author;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
    private List<Comment> comments = new ArrayList<>();
	
	@ManyToMany(
			mappedBy = "articles"
			)
	private List<Category> categories = new ArrayList<>();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getId_author() {
		return id_author;
	}
	public void setId_author(Integer id_author) {
		this.id_author = id_author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
	
	
//	@OneToOne(
//			cascade = CascadeType.ALL,
//			fetch = FetchType.EAGER,
//			orphanRemoval = true
//			)
//	@JoinColumn(name = "id_author")
//	private List<Comment> comments = new ArrayList<>();
//	
//	@OneToMany(
//			cascade = CascadeType.ALL,
//			fetch = FetchType.EAGER,
//			orphanRemoval = true
//			)
//	@JoinColumn(name = "id_article")
//	private List<Comment> comments = new ArrayList<>();
//	
//	@ManyToMany(
//			mappedBy = "articles"
//			)
//	private List<Category> categories = new ArrayList<>();
//
//	public Integer getId() {
//		return article_id;
//	}

//	public List<Comment> getComments() {
//		return comments;
//	}
//
//	public void setComments(List<Comment> comments) {
//		this.comments = comments;
//	}
//
//	public List<Category> getCategories() {
//		return categories;
//	}
//
//	public void setCategories(List<Category> categories) {
//		this.categories = categories;
//	}
	
	

}
