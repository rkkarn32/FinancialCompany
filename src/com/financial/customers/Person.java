package com.financial.customers;

import java.util.Date;

import com.financial.utilities.CommonResources;

public class Person extends Customer implements IPerson {

	private Date dateofbirth;

	public Person(){
		super();
		setType(CommonResources.CUSTORMER_PERSON);
	}
	public Person(String name, String email, String type, IAddress address) {
		super(name, email, type, address);
		// TODO Auto-generated constructor stub
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}
	@Override
	public void setNumofEmp(int numofEmp) {
		// TODO Auto-generated method stub
		
	}
}
