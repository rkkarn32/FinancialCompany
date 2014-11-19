package com.ccard;

import com.financial.account.Entry;

public class Gold extends CreditCardAccount {
	
	
	public Gold(double initialBalance, String accountType) {
		super(initialBalance, accountType);
		super.setMI(0.06);
		super.setMP(0.10);
	}

	@Override
	public String hasToSendMail(Entry entry) {
		// TODO Auto-generated method stub
		return null;
	}
}
