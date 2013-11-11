package com.t3g.cookbooks.db.entities;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "books")
public class Book {
	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(canBeNull = false)
	private String isbn;
	
	@DatabaseField(canBeNull = false)
	private String title;
	
	@DatabaseField(canBeNull = false)
	private int pages;
	
	@DatabaseField(canBeNull = false)
	private float price;
	
	@DatabaseField(canBeNull = false)
	private Date publishdate;
	
	@DatabaseField()
	private String summary;
	
	@DatabaseField()
	private String sample; //first pages
	
	@DatabaseField(foreignAutoCreate = true)
	private Author author;
	
	@DatabaseField(foreignAutoCreate = true)
	private Language language;
	
	public Book() {
		super();
	}
	
	public Book(long id) {
		super();
		this.id = id;
	}
		
	public Book(String isbn, String title, int pages, float price,
			Date publishdate, String summary, String sample, Author author,
			Language language) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.price = price;
		this.publishdate = publishdate;
		this.summary = summary;
		this.sample = sample;
		this.author = author;
		this.language = language;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Date getPublishDate() {
		return publishdate;
	}
	
	public void setPublishDate(Date publishdate) {
		this.publishdate = publishdate;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String getSample() {
		return sample;
	}
	
	public void setSample(String sample) {
		this.sample = sample;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Language getLanguage() {
		return language;
	}
	
	public void setLanguage(Language language) {
		this.language = language;
	}
}
