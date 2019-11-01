package com.example.demo.entity;

public class User {
	
	private String id;
	private String username;
	private String password;
	private String phone;

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	

	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + "]";
	}


	
}
