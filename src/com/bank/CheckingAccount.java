package com.bank;

import com.financial.account.Account;
import com.financial.account.Entry;
import com.financial.customers.Company;
import com.financial.customers.Person;
import com.financial.utilities.CommonResources;

public class CheckingAccount extends Account {

	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		setInterestRate(5.1);
	}

	@Override
	public void setAccountType(String accountType) {
		setAccountType(Utils.ACCOUNT_TYPE_CHECKING);
	}

	@Override
	public void setInterestRate(double interestRate) {
		super.setInterestRate(interestRate);
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
