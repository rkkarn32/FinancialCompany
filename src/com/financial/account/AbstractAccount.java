package com.financial.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;

public abstract class AbstractAccount implements IAccount {

	private String accountNumber;
	private List<Entry> entryList;
	private double totalBalance;
	private ICustomer accountHolder;
	private String accountType;
	private double interestRate;
	
	private static int counter = 1000;

	public AbstractAccount(String accountNumber, double initialBalance) {
		this.accountNumber = counter + this.accountType;
		this.totalBalance = initialBalance;
		this.entryList = new ArrayList<Entry>();
	}

	public boolean deposite(double amount) {
		this.totalBalance += amount;
		createEntry(amount, CommonResources.TRANSACTION_DEPOSIT);
		return true;
	}
	
	private void createEntry(double amount,String info){
		Entry newEntry = new Entry(amount, new Date(), info);
		addEntry(newEntry);
	}

	public double getBalance() {
		return this.totalBalance;
	}

	public boolean withdraw(double amount) {

		this.totalBalance -= amount;
		createEntry(amount, CommonResources.TRANSACTION_WITHDRAW);
		return true;
	}

	public void addEntry(Entry entry) {
		this.entryList.add(entry);
		hasToSendMail();
	}

	public boolean sendEmail() {
		if (hasToSendMail()) {
			System.out.println("mail sent :: ");
			return true;
		}
		System.out.println("Mail not sent :: ");
		return false;
	}

	public StringBuilder generateReport() {

		StringBuilder myBuilder = new StringBuilder();
		myBuilder.append("\n------------- Account No: " + this.accountNumber
				+ " -------------");
		myBuilder.append("\n" + this.accountHolder + "\n");
		myBuilder.append(this + "\n");
		myBuilder
				.append("------------- Transaction Report ---------------------\n");
		try {
			for (Iterator<Entry> it = this.entryList.iterator(); it.hasNext();) {
				Entry entry = it.next();
				myBuilder.append(entry + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myBuilder;
	}

	public void addInterest(){
		double intersetAmount = this.totalBalance * this.getInterestRate() / 100;
		this.totalBalance += intersetAmount;
		createEntry(intersetAmount, CommonResources.TRANSACTION_INTERESTAMOUNT);
	}
	
	@Override
	public String toString() {
		return "Account{" + "acctNumber=" + this.accountNumber + ", balance="
				+ this.totalBalance + '}';
	}

	public boolean hasToSendMail() {

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
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
