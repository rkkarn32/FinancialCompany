package com.bank;

import java.util.Date;

import com.bank.controller.BankFrmController;
import com.bank.view.BankFrm;
import com.financial.account.AccountManager;
import com.financial.account.CalculateInterestFunctor;
import com.financial.application.FinCo;
import com.financial.customers.Address;
import com.financial.customers.IAddress;
import com.financial.customers.ICustomer;
import com.financial.customers.Person;
import com.financial.factories.SingletonFactory;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransaction;
import com.financial.interfaces.ITransactionManager;
import com.financial.transaction.Deposite;
import com.financial.transaction.TransactionManager;
import com.financial.transaction.Withdraw;
import com.financial.utilities.CommonResources;

public class Bank {

	public static void main(String args[]) {

		ICustomer personalCustomer = new Person();
		IAddress address = new Address("1000N fourth street", "Fairfield",
				"IA", 52557);
		personalCustomer.setName("Rachana Koirala");
		personalCustomer.setAddress(address);
		personalCustomer.setDateofbirth(new Date(10 / 9 / 1990));
		personalCustomer.setEmail("koirala.rachana@gmail.com");
		personalCustomer.setType(CommonResources.CUSTORMER_PERSON);

		IAccount savingAccount = new SavingAccount(100, Utils.ACCOUNT_TYPE_SAVING);
		savingAccount.setAccountHolder(personalCustomer);

		AccountManager accountManager = SingletonFactory.getAccountManager();
		accountManager.addAccount(savingAccount);

		ITransactionManager transactionManager = new TransactionManager();
		
		ITransaction deposit = new Deposite(savingAccount, 1000);
		transactionManager.performOperation(deposit);
		
		ITransaction withdraw = new Withdraw(savingAccount, 450);
		transactionManager.performOperation(withdraw);
		
		System.out.println(savingAccount.generateReport());
		
		accountManager.addInterest(new CalculateInterestFunctor());
		
		System.out.println(savingAccount.generateReport());
		
		
		
		
		//new implementation for bank
		BankFrm bankFrame                = new BankFrm("Bank View");
		BankFrmController bankController = new BankFrmController(accountManager.getDaoAccount().getAll(), bankFrame);
		FinCo.setController(bankController);
		FinCo.main(null);
	}
}
