package com.financial.account;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.financial.interfaces.IAccount;

public class AccountManager{

	private List<IAccount> accountList = new ArrayList<IAccount>();
	
	public void addAccount(IAccount newAccount){
		this.accountList.add(newAccount);
	}
	
	public void removeAccount(IAccount account){
		this.accountList.remove(account);
	}
	
	public List<IAccount> getAccountList(){
		return this.accountList;
	}
	
	public void addInterest(Functor functor){
		Iterator<IAccount> it = this.accountList.iterator();
		while(it.hasNext()){
			IAccount account = it.next();
			functor.compute(account);
		}
	}
	
	public IAccount getAccountByAccountNumber(String accountNumber){
		Iterator<IAccount> it = this.accountList.iterator();
		while(it.hasNext()){
			IAccount account = it.next();
			if(account.getAccountNumber().equals(accountNumber)){
				return account;
			}
		}
		return null;
	}
}
