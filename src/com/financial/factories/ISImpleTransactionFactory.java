package com.financial.factories;

import com.financial.interfaces.ITransaction;
import com.financial.utilities.CommonResources;


public interface ISImpleTransactionFactory extends IFinancialFactory {
	ITransaction createTransaction(CommonResources.TRANSACTION transactionenum);

}
