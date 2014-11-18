package com.financial.factories;

import com.financial.account.Account;
import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;

public interface IFinancialFactory {
	

	ICustomer createCustomer(String customerString);

	IAccount createAccount(String accounteString);

	ITransaction createTransaction(String transactionString);

}
