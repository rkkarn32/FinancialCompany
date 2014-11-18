package com.financial.factories;

import com.financial.account.Account;
import com.financial.customers.Company;
import com.financial.customers.Person;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;


public class SimpleAccountFactory {
	
	public static IAccount createAccount(String accountenum){
		switch (accountenum) {
		case (CommonResources.ACCOUNT):
			return new Account("Keshav",1245);
		
		}
		return null;
		
	}
}
