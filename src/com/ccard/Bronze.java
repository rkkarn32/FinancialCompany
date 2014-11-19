package com.ccard;

import com.financial.account.Entry;

public class Bronze extends CreditCardAccount {

	public Bronze(double initialBalance) {
		super(initialBalance);
		super.setMI(0.10);
		super.setMP(0.14);
		
	}
	
	public  void setAccountType(String accountType){
		super.setAccountType(accountType);
	}

	@Override
	public String hasToSendMail(Entry entry) {
		// TODO Auto-generated method stub
		return null;
	}

}
