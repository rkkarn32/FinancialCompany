package com.financial.factories;

import com.financial.interfaces.ITransaction;
import com.financial.utilities.CommonResources;

public interface ISImpleTransactionFactory {
	ITransaction createTransaction(CommonResources.Transaction transaction);

}
