package com.financial.account;

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
	
}
