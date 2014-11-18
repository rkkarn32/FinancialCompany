package com.ccard;

public class Bronze extends CCard {

	public Bronze(double initialBalance) {
		super(initialBalance);
		super.setMI(0.10);
		super.setMP(0.14);
		
	}
	
	public  void setAccountType(String accountType){
		super.setAccountType(accountType);
	}

}
