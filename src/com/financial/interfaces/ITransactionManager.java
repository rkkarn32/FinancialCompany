package com.financial.interfaces;

public interface ITransactionManager {
	void performOperation(ITransaction transaction);
	void undo(ITransaction transaction);
}
	