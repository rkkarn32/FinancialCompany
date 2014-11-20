package com.ccard;

import com.financial.account.Entry;
import com.financial.customers.Company;
import com.financial.customers.Person;
import com.financial.utilities.CommonResources;

public class Gold extends CreditCardAccount {
	public Gold(double initialBalance, String accountType) {
		super(initialBalance, accountType);
		super.setMI(0.06);
		super.setMP(0.10);
	}

	@Override
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
					&& entry.getAmount() > 400) {
				super.sendEmail(entry, "Withdraw is larger than $400");
				return "Withdraw is larger than $400";
			}
		}
		return null;
	}
}
