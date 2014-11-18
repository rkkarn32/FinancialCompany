package com.ccard;

import com.financial.account.Account;
import com.financial.factories.FinancialFactory;
import com.financial.factories.SimpleAccountFactory;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources.ACCOUNT;

public class CCFactory extends FinancialFactory{
	
	@Override
	public IAccount createAccount(String accountenum){
		
		switch (accountenum) {
		case :
			return new Account("Keshav",1245);
		
		}
		return null;
		
		return SimpleAccountFactory.createAccount(accountenum);
	}
	

}
