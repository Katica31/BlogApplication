package com.elsoBlog.domain;

import java.util.Date;

public class Story{
	
	private String Title;
	private String content;
	private Date posted;
	private String author;
	
	
	public Story() {
	}


	public Story(String title, String content, Date latestDate, String author) {
		super();
		Title = title;
		this.content = content;
		this.posted = latestDate;
		this.author = author;
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


	public Date getLatestDate() {
		return posted;
	}


	public void setLatestDate(Date latestDate) {
		this.posted = latestDate;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
}