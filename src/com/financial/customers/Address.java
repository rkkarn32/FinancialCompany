package com.financial.customers;

public class Address implements IAddress{
	
	private String street,city,state;
	private int zip;
	
	public Address(String street, String city, String state, int zip) {
		
		this.street = street;
		this.city   = city;
		this.state  = state;
		this.zip    = zip;
	}

	public String getStret() {
		return street;
	}

	public void setStret(String stret) {
		this.street = stret;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public void showInfo() {
		
	}
}
