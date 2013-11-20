package com.t3g.cookbooks.db.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "tags_books")
public class BookTag {
	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(foreign = true, foreignAutoRefresh = true)
	private Book book;
	
	@DatabaseField(foreign = true, foreignAutoRefresh = true)
	private Tag tag;
	
	public BookTag() {
		super();
	}
	
	public BookTag(Book book, Tag tag) {
		this.book = book;
		this.tag = tag;
	}
}
