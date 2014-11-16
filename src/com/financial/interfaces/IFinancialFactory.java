package com.financial.interfaces;

public interface IFinancialFactory {
	IAccount createAccount();
	ICustomer createCustomer();
}
