package com.financial.interfaces;

import com.financial.customers.ICustomer;

public interface IFinancialFactory {
	IAccount createAccount();
	ICustomer createCustomer();
}
