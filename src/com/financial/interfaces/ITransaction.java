package com.financial.interfaces;

public interface ITransaction {
	void transact();
	void undoTransact();
	
	public IAccount getAccount() ;

	public void setAccount(IAccount account) ;

	public double getAmount() ;

	public void setAmount(double amount);

}
