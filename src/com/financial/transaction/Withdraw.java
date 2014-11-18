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

}
