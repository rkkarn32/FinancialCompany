package com.financial.factories;

import com.financial.account.Account;
import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;
import com.financial.utilities.CommonResources.ACCOUNT;
import com.financial.utilities.CommonResources.CUSTOMER;
import com.financial.utilities.CommonResources.TRANSACTION;

public interface IFinancialFactory {
	

	ICustomer createCustomer(String customerString);

	IAccount createAccount(String accounteString);

	ITransaction createTransaction(String transactionString);

}
