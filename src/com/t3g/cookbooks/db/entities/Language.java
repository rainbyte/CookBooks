package com.t3g.cookbooks.db.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "languages")
public class Language {
	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(unique = true)
	private String name;
	
	public Language() {
		super();
	}
	
	public Language(long id) {
		super();
		this.id = id;
	}
	
	public Language(String name) {
		super();
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
