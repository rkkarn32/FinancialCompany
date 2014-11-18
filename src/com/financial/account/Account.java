package com.financial.account;

import com.financial.utilities.CommonResources;

public class Account extends AbstractAccount {

	public Account(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		setAccountType(CommonResources.ACCOUNT_DEFAULT_TYPE);
		setInterestRate(CommonResources.ACCOUNT_DEFAULT_INTERESTRATE);
	}

	@Override
	public void setAccountType(String accountType) {
	     super.setAccountType(accountType);;
	}
	
	@Override
	public void setInterestRate(double interestRate){
		this.setInterestRate(interestRate);
	}
}
