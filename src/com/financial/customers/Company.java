package com.financial.customers;

public class Company extends Customer implements ICompany {
	
	private int numofEmp;
	
	//Default Constructor
	public Company() {
		super();
	}
	
	public Company(String name, String email, String type, IAddress address) {
		super(name, email, type, address);
		// TODO Auto-generated constructor stub
	}
	
	
	public int getNumofEmp() {
		return numofEmp;
	}

	public void setNumofEmp(int numofEmp) {
		this.numofEmp = numofEmp;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}
	

}
