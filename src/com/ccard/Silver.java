package com.ccard;

public class Silver extends CreditCardAccount{

	public Silver(double initialBalance) {
		super(initialBalance);
		
		super.setMI(0.08);
		super.setMP(0.12);
	
	}
	
	
	public  void setAccountType(String accountType){
		super.setAccountType(accountType);
	}
	

}
