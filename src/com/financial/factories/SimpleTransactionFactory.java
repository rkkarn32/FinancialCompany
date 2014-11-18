package com.financial.factories;

import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;
import com.financial.transaction.Deposite;
import com.financial.transaction.Withdraw;
import com.financial.utilities.CommonResources;
import com.financial.utilities.CommonResources.ACCOUNT;
import com.financial.utilities.CommonResources.CUSTOMER;
import com.financial.utilities.CommonResources.TRANSACTION;

public class SimpleTransactionFactory {
	
	public static ITransaction createTransaction(String transactionenum){
		
		switch (transactionenum) {
		case CommonResources.:
			return new Deposite(null,0.0);
		case WITHDRAW:
			return new Withdraw(null,0.0);
		}
		return null;
	}

	
	

}
