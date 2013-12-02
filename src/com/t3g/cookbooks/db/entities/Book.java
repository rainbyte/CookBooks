package com.t3g.cookbooks.db.entities;

import java.sql.SQLException;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.t3g.cookbooks.db.Database;

@DatabaseTable(tableName = "books")
public class Book {
	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(canBeNull = false, unique = true)
	private String isbn;
	
	@DatabaseField(canBeNull = false)
	private String title;
	
	@DatabaseField(canBeNull = false)
	private int pages;
	
	@DatabaseField(canBeNull = false)
	private float price;
	
	@DatabaseField()
	private Date publish_date;
	
	@DatabaseField()
	private String summary;
	
	@DatabaseField()
	private String sample; //first pages
	
	@DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
	private Author author;
	
	@DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
	private Language language;
	
	@DatabaseField(canBeNull = false)
	private String image_path;
	
	public Book() {
		super();
	}
	
	public Book(long id) {
		super();
		this.id = id;
	}
		
	public Book(String isbn, String title, int pages, float price,
			Author author,
			Language language,
			String image_path) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.price = price;
		this.author = author;
		this.language = language;
		this.image_path = image_path;
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
		return publish_date;
	}
	
	public void setPublishDate(Date publishdate) {
		this.publish_date = publishdate;
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
	
	public String getImagePath() {
		return image_path;
	}
	
	public void setImagePath(String image_path) {
		this.image_path = image_path;
	}	
	
	public static void main(String[] args) {
		Book book = new Book("9dh329rn3dbu", "Ingenieria de Software 9ed", 700, 500,
				new Author("???", "Sommervile", new Country("USA")),
				new Language("Español"),
				"");
		
		try {
			Database.getBookDao().create(book);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
