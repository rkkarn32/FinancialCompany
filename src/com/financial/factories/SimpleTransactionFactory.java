package com.financial.factories;

import com.financial.interfaces.ITransaction;
import com.financial.transaction.Deposite;
import com.financial.transaction.Withdraw;
import com.financial.utilities.CommonResources.TRANSACTION;

public class SimpleTransactionFactory implements ISImpleTransactionFactory {

	@Override
	public static ITransaction createTransaction(TRANSACTION transactionenum) {
		switch (transactionenum) {
		case DEPOSITE:
			return new Deposite(null,0.0);
		case WITHDRAW:
			return new Withdraw(null,0.0);
		}
		return null;
	}

}
