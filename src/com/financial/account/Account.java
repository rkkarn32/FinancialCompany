package com.financial.account;

import java.util.Vector;

public class Account extends AbstractAccount {

	public Account(double initialBalance, String accountType) {
		super(initialBalance, accountType);
		setInterestRate(10.1);
	}

	@Override
	public void setInterestRate(double interestRate) {
		super.setInterestRate(interestRate);
	}

	@Override
	public String hasToSendMail(Entry entry) {
	
		return null;
	}
	public Vector getVector(){
		this.vector = new Vector();
		this.vector.add(this.accountNumber);
		this.vector.add(this.accountHolder.getName());
		this.vector.add(this.totalBalance);
		return this.vector;
	}
	
}
