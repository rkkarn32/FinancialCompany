package com.bank;

import java.util.Date;

import com.financial.account.AccountManager;
import com.financial.application.FinCo;
import com.financial.customers.Address;
import com.financial.customers.IAddress;
import com.financial.customers.ICustomer;
import com.financial.customers.Person;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransactionManager;
import com.financial.transaction.TransactionManager;

public class Bank {

	public static void main(String args[]) {
		System.out.println("bank main :: ");
		FinCo.main(null);

		ICustomer personalCustomer = new Person();
		IAddress address = new Address("1000N fourth street", "Fairfield",
				"IA", 52557);
		personalCustomer.setName("Rachana Koirala");
		personalCustomer.setAddress(address);
		personalCustomer.setDateofbirth(new Date(10 / 9 / 1990));
		personalCustomer.setEmail("koirala.rachana@gmail.com");

		IAccount savingAccount = new SavingAccount(100);
		savingAccount.setAccountHolder(personalCustomer);

		AccountManager accountManager = new AccountManager();
		accountManager.addAccount(savingAccount);

		ITransactionManager transactionManager = new TransactionManager();
		
		
	}
}
