package com.financial.factories;

import com.financial.account.Account;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;


public class SimpleAccountFactory {
	
	public static IAccount createAccount(String accountString){
		
		if(accountString.equals(CommonResources.ACCOUNT_TYPE_DEFAULT))
			return new Account(1000);
		return null;
		
	}
}
