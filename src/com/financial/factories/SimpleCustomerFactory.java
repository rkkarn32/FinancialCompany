package com.financial.factories;

import com.financial.customers.Company;
import com.financial.customers.ICustomer;
import com.financial.customers.Person;
import com.financial.transaction.Deposite;
import com.financial.transaction.Withdraw;
import com.financial.utilities.CommonResources;

public class SimpleCustomerFactory {
	public static ICustomer createCustomer(String customerenum){	
		if(customerenum.equals(CommonResources.CUSTORMER_COMPANY)){
			return new Company();
		}else if(customerenum.equals(CommonResources.CUSTORMER_PERSON)){
			return new Person();
		}
		return null;
		
	}

}
