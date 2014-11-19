package com.financial.transaction;

import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;

public class Deposite implements ITransaction{
	
	private IAccount account;
	private double amount;
	
	
	public Deposite(IAccount account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	public IAccount getAccount() {
		return account;
	}

	public void setAccount(IAccount account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public void transact() {
		account.deposite(amount);
	}

	@Override
	public void undoTransact() {
		account.withdraw(amount);		
	}
}
