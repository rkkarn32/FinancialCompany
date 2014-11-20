package com.bank.account;

import java.util.Vector;

import com.financial.account.Account;
import com.financial.account.Entry;
import com.financial.customers.Company;
import com.financial.customers.Person;
import com.financial.utilities.CommonResources;

public class CheckingAccount extends Account {

	public CheckingAccount(double initialBalance, String accountType) {
		super(initialBalance, accountType);
		setInterestRate(5.1);
	}
	@Override
	public void setInterestRate(double interestRate) {
		super.setInterestRate(interestRate);
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
	
	public String hasToSendMail(Entry entry) {
		if (this.getAccountHolder() instanceof Company) {
			super.sendEmail(entry, "Transaction Done");
			return "Transaction Done";
		} else if (this.getAccountHolder() instanceof Person) {
			if (this.getBalance() < 0) {
				super.sendEmail(entry, "Balance is negative");
				return "Balance is negative";
			} 
			if (entry.getEntryInfo().equals(CommonResources.TEXT_WITHDRAW)
					&& entry.getAmount() > 500) {
				super.sendEmail(entry, "Withdraw is larger than $500");
				return "Withdraw is larger than $500";
			}
		}
		return null;
	}
}
