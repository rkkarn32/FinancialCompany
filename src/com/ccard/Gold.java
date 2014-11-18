package com.ccard;

public class Gold extends CreditCardAccount {
	
	
	public Gold(double initialBalance) {
		super(initialBalance);
		super.setMI(0.06);
		super.setMP(0.10);
	}

	public  void setAccountType(String accountType){
		super.setAccountType(accountType);
	}
}
