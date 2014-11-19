package com.financial.account;

import java.util.Iterator;

import com.financial.interfaces.IAccount;
import com.financial.persistance.AccountDao;
import com.financial.persistance.IDao;

public class AccountManager {
	
	private IDao<IAccount,String> daoAccount;

	public AccountManager() {
		this.daoAccount = new AccountDao<String>();
	}

	public void addAccount(IAccount newAccount) {
		this.daoAccount.persist(newAccount);
	}

	public void removeAccount(IAccount account) {
		this.daoAccount.remove(account);
	}

	public void addInterest(Functor functor) {
		Iterator<IAccount> it = this.daoAccount.getAll().iterator();
		while (it.hasNext()) {
			IAccount account = it.next();
			functor.compute(account);
		}
	}

	public IAccount getAccountByAccountNumber(String accountNumber) {
		
		return this.daoAccount.getAccount(accountNumber);
	}
	
	public IDao<IAccount,String> getDaoAccount() {
		return daoAccount;
	}

	public void setDaoAccount(AccountDao<String> daoAccount) {
		this.daoAccount = daoAccount;
	}
}
