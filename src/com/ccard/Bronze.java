package com.ccard;

public class Bronze extends CCard {

	public Bronze(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		super.setMI(0.10);
		super.setMP(0.14);
		
	}

}
