package com.financial.factories;

import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;
import com.financial.transaction.Deposite;
import com.financial.transaction.Withdraw;
import com.financial.utilities.CommonResources;

public class SimpleTransactionFactory {
	
	public static ITransaction createTransaction(String transactionString){
				
		if(transactionString.equals(CommonResources.TEXT_DEPOSIT)){
			return new Deposite(null, 0.0);
		}else if(transactionString.equals(CommonResources.TEXT_WITHDRAW)){
			return new Withdraw(null, 0.0);
		}
		return null;
	}
}
