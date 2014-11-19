package com.financial.persistance;

import java.util.List;

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

	@Override
	public List<ICustomer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
