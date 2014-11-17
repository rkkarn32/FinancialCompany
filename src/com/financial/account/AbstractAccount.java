package com.financial.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;

public abstract class AbstractAccount implements IAccount{

	private String accountNumber;
	private List<Entry> entryList;
	private double totalBalance;
	private ICustomer accountHolder;
	private String accountType;

	public AbstractAccount(String accountNumber, double initialBalance){
		this.accountNumber = accountNumber;
		this.totalBalance  = initialBalance;
		this.entryList     = new ArrayList<Entry>();
	}
	
	public boolean deposite(double amount){
		this.totalBalance += amount;
		Entry newEntry     = new Entry(amount,new Date(), "Deposit");
		addEntry(newEntry);
		return true;
	}
	public double getBalance(){
		return this.totalBalance;
	}
	public boolean withdraw(double amount){
		
		this.totalBalance -= amount;
		Entry newEntry     = new Entry(amount,new Date(), "Withdraw");
		addEntry(newEntry);
		
		return true;
	}
	public void addEntry(Entry entry){
		this.entryList.add(entry);
		hasToSendMail();
	}
	public boolean sendEmail(){
		if(hasToSendMail()){
			System.out.println("mail sent :: ");
			return true;
		}
		System.out.println("Mail not sent :: ");
		return false;
	}
	public boolean hasToSendMail(){
		
		return hasToSendMail();
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public List<Entry> getEntryList() {
		return entryList;
	}

	public void setEntryList(List<Entry> entryList) {
		this.entryList = entryList;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public ICustomer getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(ICustomer accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
