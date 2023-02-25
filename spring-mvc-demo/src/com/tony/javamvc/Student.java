package com.tony.javamvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions = null;
	private String favoriteLang;
	private ArrayList<String> operatingSystems = null;
	public Student() {
		// TODO Auto-generated constructor stub
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("AR", "Argentina");
		countryOptions.put("SC", "Scotland");
		operatingSystems = new ArrayList<>();
		operatingSystems.add("Windows");
		operatingSystems.add("Linux");
		operatingSystems.add("Mac");
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getFavoriteLang() {
		return favoriteLang;
	}
	public void setFavoriteLang(String favoriteLang) {
		this.favoriteLang = favoriteLang;
	}
	public ArrayList<String> getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(ArrayList<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
}
