package com.gc.dto;

import java.util.ArrayList;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	private String gender;
	private String city;
	private ArrayList<String> favoriteDrinks;
	
	public User() {
		firstName = "";
		lastName = "";
		email = "";
		phoneNumber = "";
		password = "";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ArrayList<String> getFavoriteDrinks() {
		return favoriteDrinks;
	}

	public void setFavoriteDrinks(ArrayList<String> favoriteDrinks) {
		this.favoriteDrinks = favoriteDrinks;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
