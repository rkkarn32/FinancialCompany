package com.financial.transaction;

import com.financial.customers.IAddress;
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

	@Override
	public void transact() {
		// TODO Auto-generated method stub
		account.deposite(amount);
		
	}

	@Override
	public void undoTransact() {
		// TODO Auto-generated method stub
		
		
		
	}

}
