package com.financial.customers;

import java.util.Date;

import com.financial.utilities.CommonResources;



public class Person extends Customer implements IPerson{
	
	private Date dateofbirth;

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

}
