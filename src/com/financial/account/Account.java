package com.financial.account;

import com.financial.utilities.CommonResources;

public class Account extends AbstractAccount {

	public Account(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		setAccountType(CommonResources.ACCOUNT_DEFAULT_TYPE);
		setInterestRate(10.1);
	}

	@Override
	public void setAccountType(String accountType) {
		super.setAccountType(accountType);
		;
	}

	@Override
	public void setInterestRate(double interestRate) {
		super.setInterestRate(interestRate);
	}

	public String hasToSendMail(Entry entry) {
		if (this.getBalance() < 0) {
			return "Balance is negative";
		}
		return null;
	}
	
	
	
	
}
