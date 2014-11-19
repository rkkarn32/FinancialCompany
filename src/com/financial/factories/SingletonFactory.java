package com.financial.factories;

import com.financial.account.AccountManager;
import com.financial.interfaces.ITransactionManager;
import com.financial.transaction.TransactionManager;

public class SingletonFactory {
	
	private static AccountManager accountManager = new AccountManager();
	private static ITransactionManager transactionManager = new TransactionManager();
		
	public static ITransactionManager getTransactionManager(){
		return transactionManager;
	}
	
	public static AccountManager getAccountManager(){
		return accountManager;
	}
}
