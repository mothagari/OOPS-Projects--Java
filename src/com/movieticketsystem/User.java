package com.movieticketsystem;
//ths class represents a user with details such as name,email, and 
public class User {
	private String name;//name of user
	private String email; // email is for user (used for authentication)
	private String password;//password for authentication
	//constructor to initialize user detail
	public User(String name, String email, String password) {
		this.name=name;
		this.email=email;
		this.password=password;
	}
	// getter methods for retrieve the name of the user
	public String getName() {
		return name;
	}
	//method for autjenticate the user by comapring email and password
	public boolean authenticate(String email, String password) {
		return this.email.equals(email) && this.password.equals(password);
	}

}
