package com.financial.persistance;

import com.financial.customers.ICustomer;

public class CustomerDao<R> implements IDao<ICustomer, R>{

	@Override
	public boolean persist(ICustomer object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(ICustomer object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ICustomer getAccount(R object) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
