package com.financial.factories;
import com.financial.utilities.CommonResources;


public class SimpleFinancialFactory {
	
	public IFinancialFactory createFinancialFactory(String choice ){
	//		switch (choice) {
	//        case CUSTOMER_FACTORY:
	//            return new SimpleCustomerFactory();
	//        case ACCOUNT_FACTORY:
	//            return new FinancialFactory();
	//        case TRANSACTION_FACTORY:
	//            return new  FinancialFactory();    
	//    }
    return new FinancialFactory();
	}

	
}
