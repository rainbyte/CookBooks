package com.t3g.cookbooks.db.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "purchases")
public class Purchase {
	@DatabaseField(generatedId = true)
	long id;
	
	@DatabaseField(foreign = true, foreignAutoRefresh = true)
	User user;
	
	@DatabaseField(foreign = true, foreignAutoRefresh = true)
	Book book;
	
	@DatabaseField(canBeNull = false)
	float price;
	
	@DatabaseField(canBeNull = false)
	String status;
	
	public Purchase() {
		super();
	}
	
	public Purchase(long id) {
		super();
		this.id = id;
	}
	
	public Purchase(User user, Book book, float price, String status) {
		super();
		this.user = user;
		this.book = book;
		this.price = price;
		this.status = status;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}	
}
