package com.t3g.cookbooks.db.entities;

import java.sql.SQLException;
import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.t3g.cookbooks.db.Database;

@DatabaseTable(tableName = "authors")
public class Author {
	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(canBeNull = false)
	private String name;
	
	@DatabaseField(canBeNull = false)
	private String surname;
	
	@DatabaseField(foreign = true, foreignAutoCreate = true)
	private Country country;
	
	@DatabaseField()
	private Date birthdate;
	
	@DatabaseField()
	private char gender;
	
	@DatabaseField()
	private String about;
	
	public Author() {
		super();
		// Mandatory
	}
	
	public Author(long id) {
		super();
		this.id = id;
	}
	
	public Author(String name, String surname, Country country) {
		super();
		this.name = name;
		this.surname = surname;
		this.country = country;
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
	
	public Country getCountry() {
		return country;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}
	
	public Date getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public static void main(String[] args) {
		Author author = new Author();
		author.setName("Andrew");
		author.setSurname("Tanenbaum");
		author.setCountry(new Country("Finland"));
		try {
			Database.getAuthorDao().create(author);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
