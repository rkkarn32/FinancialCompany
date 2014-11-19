package com.ccard;

import com.financial.account.Entry;

public class Silver extends CreditCardAccount{

	public Silver(double initialBalance) {
		super(initialBalance);
		
		super.setMI(0.08);
		super.setMP(0.12);
	
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
