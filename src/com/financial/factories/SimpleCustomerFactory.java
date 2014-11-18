package com.financial.factories;

import com.financial.customers.Company;
import com.financial.customers.ICustomer;
import com.financial.customers.Person;
import com.financial.transaction.Deposite;
import com.financial.transaction.Withdraw;
import com.financial.utilities.CommonResources.CUSTOMER;


public class SimpleCustomerFactory {
	public static ICustomer createCustomer(String customerenum){
		
		switch (customerenum) {
		case :
			return new Company();
		case COMPANY:
			return new Person();
		}
		return null;
		
	}

}
