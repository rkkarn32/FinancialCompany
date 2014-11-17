package com.financial.customers;

import com.financial.utilities.CommonResources;

public class Company extends Customer implements ICompany {
	private int numofEmp;

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
