package com.ccard;

import java.util.Date;

import javax.swing.UIManager;

import com.bank.Utils;
import com.bank.account.SavingAccount;
import com.bank.controller.BankFrmController;
import com.bank.factories.BankFactory;
import com.bank.view.BankFrm;
import com.ccard.account.Gold;
import com.ccard.controller.CCardFrmController;
import com.ccard.factories.CCFactory;
import com.ccard.view.CCardFrm;
import com.financial.account.AccountManager;
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

public class CCard {

	public static void main(String args[]) {
		//FinCo.main(null);

		ICustomer personalCustomer = new Person();
		IAddress address = new Address("1000N fourth street", "Fairfield",
				"IA", 52557);
		personalCustomer.setName("Rachana Koirala");
		personalCustomer.setAddress(address);
		personalCustomer.setDateofbirth(new Date(10 / 9 / 1999));
		personalCustomer.setEmail("koirala.rachana@gmail.com");
		personalCustomer.setType(CommonResources.CUSTORMER_PERSON);

		IAccount goldAccount = new Gold(100,
				CreditCardCommonResources.CREDITCARD_GOLD);
		goldAccount.setAccountHolder(personalCustomer);

		AccountManager accountManager = SingletonFactory.getAccountManager();
		accountManager.addAccount(goldAccount);

		ITransactionManager transactionManager = SingletonFactory.getTransactionManager();

		ITransaction deposit = new Deposite(goldAccount, 1000);
		transactionManager.performOperation(deposit);

		ITransaction withdraw = new Withdraw(goldAccount, 200);
		transactionManager.performOperation(withdraw);

		System.out.println(goldAccount.generateReport());

		try {
			// Add the following code if you want the Look and Feel
			// to be set to the Look and Feel of the native system.

			try {
				UIManager.setLookAndFeel(UIManager
						.getSystemLookAndFeelClassName());
			} catch (Exception e) {
			}
			CCFactory creditFactory = new CCFactory();
			CCardFrm ccardFrame = new CCardFrm("CCard View");
			CCardFrmController creditController = new CCardFrmController(
					accountManager.getDaoAccount().getAll(), ccardFrame);
			creditController.setFinancialFactory(creditFactory);
			FinCo.setController(creditController);
			FinCo.main(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
