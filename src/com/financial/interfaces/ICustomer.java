package com.financial.interfaces;

public interface ICustomer {
	void showInfo();
	void addAccount(IAccount account);
	void removeAccount(IAccount account);
	void update();
}
