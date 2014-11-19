package com.financial.persistance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.financial.interfaces.IAccount;

public class AccountDao<R> implements IDao<IAccount,R>{

	private List<IAccount> myList = new ArrayList<IAccount>();
	
	public List<IAccount> getAll() {
		return myList;
	}
	
	@Override
	public boolean  persist(IAccount object) {
		myList.add(object);
		return true;
	}

	@Override
	public boolean remove(IAccount object) {
		myList.remove(object);
		return true;
	}

	@Override
	public IAccount getAccount(R object) {
		Iterator<IAccount> it = this.myList.iterator();
		while (it.hasNext()) {
			IAccount account  = it.next();
			if (account.getAccountNumber().equals(object)) {
				return account;
			}
		}
		return null;
	}
}
