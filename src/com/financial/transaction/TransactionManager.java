package com.financial.transaction;

import java.util.ArrayList;
import java.util.List;

import com.financial.account.AccountManager;
import com.financial.interfaces.ITransaction;
import com.financial.interfaces.ITransactionManager;

public class TransactionManager implements ITransactionManager{

	private List<ITransaction> transactionList;
	private List<ITransaction> undoList;
	private List<ITransaction> redoList;
	
	public TransactionManager() {
		this.transactionList = new ArrayList<ITransaction>();
		this.transactionList = new ArrayList<ITransaction>();
		this.redoList        = new ArrayList<ITransaction>();
	}
	
	@Override
	public void performOperation(ITransaction transaction) {
		transactionList.add(transaction);
		transaction.transact();
				
	}

	public List<ITransaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<ITransaction> transactionList) {
		this.transactionList = transactionList;
	}

	@Override
	public void undo(ITransaction transaction) {
		// TODO Auto-generated method stub
		transaction.undoTransact();
		undoList.add(transaction);
		
	}
}
