package com.financial.customers;

public class Address implements IAddress{
	
	private String stret,city,state;
	private int zip;

	public String getStret() {
		return stret;
	}

	public void setStret(String stret) {
		this.stret = stret;
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
