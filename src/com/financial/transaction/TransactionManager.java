package com.financial.transaction;

import java.util.ArrayList;
import java.util.List;

import com.financial.interfaces.ITransaction;
import com.financial.interfaces.ITransactionManager;

public class TransactionManager implements ITransactionManager{

	private List<ITransaction> transactionList;
	
	public TransactionManager() {
		this.transactionList = new ArrayList<ITransaction>();
	}
	
	@Override
	public void performOperation(ITransaction transaction) {
				
	}

	public List<ITransaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<ITransaction> transactionList) {
		this.transactionList = transactionList;
	}
}
