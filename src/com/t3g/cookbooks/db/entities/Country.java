package com.t3g.cookbooks.db.entities;

import java.sql.SQLException;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.t3g.cookbooks.db.Database;

@DatabaseTable(tableName = "countries")
public class Country {
	@DatabaseField(generatedId = true)
	private long id;
	@DatabaseField(unique = true)
	private String name;

	public Country() {
		super();
	}
	
	public Country(long id) {
		super();
		this.id = id;
	}
	
	public Country(String name) {
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

	public static void main(String[] args) {
		Country country1 = new Country("Japon");
		try {
			Database.getCountryDao().create(country1);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		Country country2 = new Country("China");
		try {
			Database.getCountryDao().create(country2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		for (Country country : Database.getCountryDao()) {
			if (country.getName().equals("China") || country.getName().equals("Japon")) {
				System.out.printf("Found (id = %s ; name = %s)\n", country.getId(), country.getName());
			}
		}
	}
}
