package com.financial.customers;

import com.financial.interfaces.IAccount;

public interface ICustomer {
	void showInfo();
	void addAccount(IAccount account);
	void removeAccount(IAccount account);
	void update();
	String getType();
	
}