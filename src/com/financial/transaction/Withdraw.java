package com.financial.transaction;

import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;

public class Withdraw  implements ITransaction{
	
	private IAccount account;
	private double amount;
	

	public Withdraw(IAccount account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void transact() {
		
		account.withdraw(amount);
		
	}

	@Override
	public void undoTransact() {
		
		account.deposite(amount);
		
	}

	@Override
	public IAccount getAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAccount(IAccount account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAmount(double amount) {
		// TODO Auto-generated method stub
		
	}

}
