package com.financial.account;

import com.financial.utilities.CommonResources;

public class Account extends AbstractAccount {

	public Account(double initialBalance) {
		super(initialBalance);
		setAccountType(CommonResources.ACCOUNT_TYPE_DEFAULT);
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

	@Override
	public String hasToSendMail(Entry entry) {
	
		return null;
	}
	
}
