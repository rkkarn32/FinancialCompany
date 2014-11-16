package com.financial.interfaces;

import com.financial.account.Entry;

public interface IAccount {
	double getCurrentBalance();
	void deposite();
	void withdraw();
	void addEntry(Entry entry);
	void notifyCustormers();
}
