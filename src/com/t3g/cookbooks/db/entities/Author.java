package com.t3g.cookbooks.db.entities;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "authors")
public class Author {
	public static enum Gender {
		FEMALE, MALE
	}
	
	@DatabaseField(generatedId = true)
	private long id;
	
	@DatabaseField(canBeNull = false)
	private String name;
	
	@DatabaseField(canBeNull = false)
	private String surname;
	
	@DatabaseField(canBeNull = false, foreignAutoCreate = true)
	private Country country;
	
	@DatabaseField(canBeNull = false)
	private Date birthdate;
	
	@DatabaseField(canBeNull = false)
	private Gender gender;
	
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
	
	public Author(String name, String surname, Country country, Date birthdate, Gender gender, String about) {
		super();
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.birthdate = birthdate;
		this.gender = gender;
		this.about = about;
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
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}	
}
