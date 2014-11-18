package com.financial.account;

import com.financial.interfaces.IAccount;

public class CalculateInterestFunctor implements Functor<IAccount, Double>{
	
	@Override
	public void compute(IAccount compute) {
		compute.addInterest();		
	}

	@Override
	public Double getValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
