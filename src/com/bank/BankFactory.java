package com.bank;

import com.financial.factories.FinancialFactory;
import com.financial.interfaces.IAccount;

public class BankFactory extends FinancialFactory{

	@Override
	public IAccount createAccount(String accountenum){
		if(accountenum.equals(Utils.ACCOUNT_TYPE_CHECKING)){
			return new CheckingAccount(0D, Utils.ACCOUNT_TYPE_CHECKING);
		}else if(accountenum.equals(Utils.ACCOUNT_TYPE_SAVING)){
			return new SavingAccount(0D, Utils.ACCOUNT_TYPE_SAVING);
		}
		return null;
	}
}
