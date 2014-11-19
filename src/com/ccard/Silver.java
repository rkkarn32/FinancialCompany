package com.ccard;

import com.financial.account.Entry;

public class Silver extends CreditCardAccount{

	public Silver(double initialBalance, String accountType) {
		super(initialBalance, accountType);
		super.setMI(0.08);
		super.setMP(0.12);
	
	}
	@Override
	public String hasToSendMail(Entry entry) {
		// TODO Auto-generated method stub
		return null;
	}
}
