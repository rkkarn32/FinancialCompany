package com.financial.factories;

import com.financial.account.Account;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;


public class SimpleAccountFactory {
	
	public static IAccount createAccount(String accountenum){
		
		if(accountenum.equals(CommonResources.ACCOUNT))
			return new Account(1245);
		return null;
		
	}
}
