package com.ccard;

public class Gold extends CCard {

	public Gold(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		super.setMI(0.06);
		super.setMP(0.10);
	}

}
