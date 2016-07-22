package com.burningtyres.pojos;

import javax.persistence.Column;

public class Admin extends Person {

	
	private String password;

	@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
