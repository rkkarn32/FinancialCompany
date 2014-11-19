package com.financial.account;

import java.util.Iterator;

import com.financial.interfaces.IAccount;
import com.financial.persistance.DaoAccount;
import com.financial.persistance.IDao;

public class AccountManager {

	public static AccountManager accountManager = new AccountManager();
	
	private DaoAccount<String> daoAccount;

	public AccountManager() {
		this.daoAccount = new DaoAccount<String>();
	}

	public void addAccount(IAccount newAccount) {
		this.daoAccount.persist(newAccount);
	}

	public void removeAccount(IAccount account) {
		this.daoAccount.remove(account);
	}

	public void addInterest(Functor functor) {
		Iterator<IAccount> it = this.daoAccount.getAllList().iterator();
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

	public void setDaoAccount(DaoAccount<String> daoAccount) {
		this.daoAccount = daoAccount;
	}
}
