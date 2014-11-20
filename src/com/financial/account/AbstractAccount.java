package com.financial.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.financial.customers.ICustomer;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;

public abstract class AbstractAccount implements IAccount {

	protected String accountNumber;
	protected List<Entry> entryList;
	protected double totalBalance;
	protected ICustomer accountHolder;
	protected String accountType;
	protected double interestRate;
	protected Vector vector;

	private static int counter = 1000;

	public AbstractAccount(double initialBalance, String accountType) {
		this.accountType = accountType;
		this.accountNumber = counter
				+ CommonResources.splitString(this.accountType);
		this.totalBalance = initialBalance;
		this.entryList = new ArrayList<Entry>();
		this.vector = new Vector<>();
		counter++;
	}

	public boolean deposite(double amount) {
		this.totalBalance += amount;
		createEntry(amount, CommonResources.TEXT_DEPOSIT);
		return true;
	}

	private void createEntry(double amount, String info) {
		Entry newEntry = new Entry(amount, new Date(), info);
		addEntry(newEntry);
	}

	public double getBalance() {
		return this.totalBalance;
	}

	public boolean withdraw(double amount) {

		this.totalBalance -= amount;
		createEntry(amount, CommonResources.TEXT_WITHDRAW);
		return true;
	}

	public void addEntry(Entry entry) {
		this.entryList.add(entry);
		hasToSendMail(entry);
	}

	public void sendEmail(Entry entry, String subject) {
		if (this.accountHolder.getEmail() != null) {
			CommonResources.sendMail(this.accountHolder.getEmail(),
					entry.toString(), subject);
		}
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

	public void addInterest() {
		double intersetAmount = this.totalBalance * this.getInterestRate()
				/ 100;
		this.totalBalance += intersetAmount;
		createEntry(intersetAmount, CommonResources.TEXT_INTERESTAMOUNT);
	}

	@Override
	public String toString() {
		return "Account{" + "acctNumber=" + this.accountNumber + ", balance="
				+ this.totalBalance + '}';
	}

	public Vector getVector() {
		this.vector = new Vector();
		this.vector.add(this.accountNumber);
		this.vector.add(this.accountHolder.getName());
		this.vector.add(this.accountHolder.getAddress().getCity());
		this.vector.add(this.accountType);
		this.vector.add(this.accountHolder.getType());
		this.vector.add(this.totalBalance);
		return this.vector;
	}

	// public String hasToSendMail(Entry entry) {
	//
	// String message = hasToSendMail(entry);
	//
	// if (message != null) {
	// sendEmail(entry, message);
	// }
	// return hasToSendMail(entry);
	// }

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
		accountHolder.addAccount(this);
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
