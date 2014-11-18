package com.financial.factories;

import com.financial.account.AccountManager;
import com.financial.interfaces.ITransactionManager;
import com.financial.transaction.TransactionManager;

public class SingletonFactory {
	public static ITransactionManager getTransactionManager(){
		return TransactionManager.transactionManager;
	}
	
	public static AccountManager getAccountManager(){
		return AccountManager.accountManager;
	}
}
