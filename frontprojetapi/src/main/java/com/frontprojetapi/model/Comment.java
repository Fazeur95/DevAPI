package com.frontprojetapi.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Comment {
	private Integer id;
	private String content;
	private String author;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
