package com.financial.factories;

import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;

public class AbstractFinancialFactory {

	public ITransaction createTransaction() {
		return null;
	}
	
	public ICustomer createCustomer(){
		return null;
	}
	
	public IAccount createAccount(){
		return null;
	}

}
