package com.elsoBlog.domain;

import java.util.Date;

public class Story{
	
	private String Title;
	private String content;
	private Date posted;
	private String author;
	private String image;
	
	
	public Story() {
	}


	public Story(String title, String content, Date posted, String author) {
		super();
		Title = title;
		this.content = content;
		this.posted = posted;
		this.author = author;
	}
	


	public Story(String title, String content, Date posted, String author, String image) {
		super();
		Title = title;
		this.content = content;
		this.posted = posted;
		this.author = author;
		this.image = image;
	}

	

	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getPosted() {
		return posted;
	}


	public void setPosted(Date posted) {
		this.posted = posted;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	
	
	
}