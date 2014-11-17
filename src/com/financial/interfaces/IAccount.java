package com.financial.interfaces;

import java.util.List;

import com.financial.account.Entry;
import com.financial.customers.ICustomer;

public interface IAccount {

	public boolean deposite(double amount);
	public double getBalance();
	public boolean withdraw(double amount);
	public void addEntry(Entry entry);
	public boolean sendEmail();
	public boolean hasToSendMail();
	
	public String getAccountNumber();
	public void setAccountNumber(String accountNumber);
	public List<Entry> getEntryList();
	public void setEntryList(List<Entry> entryList);
	public double getTotalBalance();
	public void setTotalBalance(double totalBalance);
	public void setAccountHolder(ICustomer accountHolder);
	public ICustomer getAccountHolder();
	public String getAccountType();
	public void setAccountType(String accountType);
}