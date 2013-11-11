package com.t3g.cookbooks.db.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class User {
	@DatabaseField(generatedId = true)
	long id;
	
	@DatabaseField(canBeNull = false)
	String name;
	
	@DatabaseField(canBeNull = false)
	String surname;
	
	@DatabaseField(canBeNull = false)
	String birthdate;
	
	@DatabaseField(canBeNull = false)
	String user;
	
	@DatabaseField(canBeNull = false)
	String password;
	
	public User() {
		super();
	}
	
	public User(long id) {
		super();
		this.id = id;
	}
	
	public User(String name, String surname, String birthdate, String user,
			String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.user = user;
		this.password = password;
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
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthDate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	
}
