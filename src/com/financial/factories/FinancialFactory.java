package com.financial.factories;


import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;


public class FinancialFactory implements IFinancialFactory{
	
	public FinancialFactory() {
		
	}
	
	@Override
	public ICustomer createCustomer(String customerString){
		return SimpleCustomerFactory.createCustomer(customerString);
	}
	
	@Override
	public IAccount createAccount(String accountString){
		return SimpleAccountFactory.createAccount(accountString);
	}

	@Override
	public ITransaction createTransaction(String transactionString) {
		// TODO Auto-generated method stub
		return SimpleTransactionFactory.createTransaction(transactionString);
	}

}
