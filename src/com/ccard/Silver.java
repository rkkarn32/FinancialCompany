package com.ccard;

public class Silver extends CCard{

	public Silver(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		
		super.setMI(0.08);
		super.setMP(0.12);
	}

}
