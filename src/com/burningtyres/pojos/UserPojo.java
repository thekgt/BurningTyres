package com.burningtyres.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="users")
public class UserPojo {
	private long userId;
	private String username;
	private String password;
	private String name;
	private String email;
	private double age;
	private Date dateOfBirth;
	private String place;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
