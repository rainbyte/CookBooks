package com.t3g.cookbooks.db.entities;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class User {
	@DatabaseField(generatedId = true)
	private long id;

	@DatabaseField(canBeNull = false)
	private String name;

	@DatabaseField(canBeNull = false)
	private String surname;

	@DatabaseField()
	private Date birthdate;

	@DatabaseField(canBeNull = false)
	private String password;

	@DatabaseField(canBeNull = false)
	private String email;

	@DatabaseField(canBeNull = false)
	private String province;

	@DatabaseField(canBeNull = false)
	private String city;

	@DatabaseField(canBeNull = false)
	private String street;

	@DatabaseField(canBeNull = false)
	private int nro;

	@DatabaseField()
	private int floor;

	@DatabaseField()
	private char dept;

	@DatabaseField(canBeNull = false)
	private int postalCode;

	@DatabaseField(canBeNull = false)
	private int phone;

	@DatabaseField(canBeNull = false)
	private int cardNumber;

	@DatabaseField(canBeNull = false)
	private String cardCode;

	public User() {
		super();
	}

	public User(long id) {
		super();
		this.id = id;
	}

	public User(String name, String surname, String email, String password,
			String province, String city, String street, int nro,
			int postalCode, int phone, int cardNumber, String cardCode) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.province = province;
		this.city = city;
		this.street = street;
		this.nro = nro;
		this.postalCode = postalCode;
		this.phone = phone;
		this.cardNumber = cardNumber;
		this.cardCode = cardCode;
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

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public char getDept() {
		return dept;
	}

	public void setDept(char dept) {
		this.dept = dept;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}	
}
