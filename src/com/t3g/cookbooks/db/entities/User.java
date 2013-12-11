package com.t3g.cookbooks.db.entities;

import java.sql.SQLException;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.t3g.cookbooks.db.Database;

@DatabaseTable(tableName = "users")
public class User {
	@DatabaseField(generatedId = true)
	private long id;

	@DatabaseField(canBeNull = false)
	private String name;

	@DatabaseField(canBeNull = false)
	private String surname;

	@DatabaseField()
	private Date birth_date;

	@DatabaseField(canBeNull = false)
	private String password;

	@DatabaseField(canBeNull = false, unique = true)
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
	private int postal_code;

	@DatabaseField(canBeNull = false)
	private String phone;

	@DatabaseField(canBeNull = false)
	private String card_number;

	@DatabaseField(canBeNull = false)
	private String card_code;
	
	@DatabaseField(canBeNull = false, defaultValue = "0")
	private boolean is_admin;

	public User() {
		super();
	}

	public User(long id) {
		super();
		this.id = id;
	}

	public User(String name, String surname, String email, String password,
			String province, String city, String street, int nro,
			int postalCode, String phone, String card_number, String cardCode) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.province = province;
		this.city = city;
		this.street = street;
		this.nro = nro;
		this.postal_code = postalCode;
		this.phone = phone;
		this.card_number = card_number;
		this.card_code = cardCode;
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
		return birth_date;
	}

	public void setBirthdate(Date birth_date) {
		this.birth_date = birth_date;
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
		return postal_code;
	}

	public void setPostalCode(int postalCode) {
		this.postal_code = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCardNumber() {
		return card_number;
	}

	public void setCardNumber(String cardNumber) {
		this.card_number = cardNumber;
	}

	public String getCardCode() {
		return card_code;
	}

	public void setCardCode(String cardCode) {
		this.card_code = cardCode;
	}

	public boolean isAdmin() {
		return is_admin;
	}

	public void setAdmin(boolean is_admin) {
		this.is_admin = is_admin;
	}
	
	public static void main(String[] args) {
		User user = new User("ad", "min", "admin@cookbooks.com", "admin",
				"Buenos Aires", "La Plata", "50", 99,
				1900, "2214895858", "1111222233334444", "0000");
		user.setAdmin(true);
		
		try {
			Database.getUserDao().create(user);
			User userForQuery = Database.getUserDao().queryForSameId(user);
			System.out.printf("User %s is admin? %s\n", userForQuery.getEmail(), userForQuery.isAdmin());			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
