package com.t3g.cookbooks.db.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "tags")
public class Tag {
	@DatabaseField(generatedId = true)
	long id;
	
	@DatabaseField(canBeNull = false, unique = true)
	String name;
	
	public Tag() {
		super();
	}
	
	public Tag(long id) {
		super();
		this.id = id;
	}
	
	public Tag(String name) {
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
