package com.financial.factories;

import com.financial.account.Account;
import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;
import com.financial.utilities.CommonResources.ACCOUNT;
import com.financial.utilities.CommonResources.CUSTOMER;
import com.financial.utilities.CommonResources.TRANSACTION;

public class FinancialFactory implements IFinancialFactory{
	
	public FinancialFactory() {
		
	}
	
	@Override
	public ICustomer createCustomer(CUSTOMER customerenum){
		return SimpleCustomerFactory.createCustomer(customerenum);
	}
	
	@Override
	public IAccount createAccount(ACCOUNT accountenum){
		return SimpleAccountFactory.createAccount(accountenum);
	}

	@Override
	public ITransaction createTransaction(TRANSACTION transactionenum) {
		// TODO Auto-generated method stub
		return SimpleTransactionFactory.createTransaction(transactionenum);
	}

}