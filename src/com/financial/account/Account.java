package com.financial.account;

import com.financial.utilities.CommonResources;

public class Account extends AbstractAccount {

	public Account(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		setAccountType(null);
	}

	@Override
	public void setAccountType(String accountType) {
	     super.setAccountType(CommonResources.ACCOUNT_DEFAULT_TYPE);;
	}
}
