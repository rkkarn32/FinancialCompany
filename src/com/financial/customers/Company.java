package com.financial.customers;

public class Company extends Customer implements ICompany {
	private int numofEmp;
	
	
	public Company() {
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
