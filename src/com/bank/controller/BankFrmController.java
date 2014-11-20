package com.bank.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import com.bank.view.BankFrm;
import com.bank.view.Bank_Dlg_Add_Company;
import com.bank.view.Bank_Dlg_Add_Personal;
import com.financial.account.AccountManager;
import com.financial.controller.DefaultFrmController;
import com.financial.customers.ICustomer;
import com.financial.factories.SingletonFactory;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;
import com.financial.view.AbstractFrm;
import com.financial.view.Dialog_AddAccount;

public class BankFrmController extends DefaultFrmController {

	private ButtonListener listener;// = new ButtonListener();
	private BankFrm myBankView;

	public BankFrmController(List<IAccount> accountList, BankFrm view) {
		super(accountList, view);
		this.myBankView = view;
	}

	@Override
	public void setView(AbstractFrm view) {
		super.setView(view);
		this.myBankView = (BankFrm) view;
	}

	@Override
	public void addActionListenerToView() {
		// view.getButtonAddAccount().addActionListener(listener);
		// super.addActionListenerToView();
		listener = new ButtonListener();
		for (JButton button : view.getButtonList()) {
			button.addActionListener(listener);
			System.out.println();
		}
	}

	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == myBankView.getButtonAddAccount())
				buttonPersonalAddAccount_ActionPerformed(e);
			else if (e.getSource() == myBankView.getButtonAddInterest())
				buttonAddInterest_ActionPerformed(e);
			else if (e.getSource() == myBankView.getButtonDeposite())
				buttonDeposite_ActionPerfomed(e);
			else if (e.getSource() == myBankView.getButtonWithDraw())
				buttonWithdraw_ActionPerformed(e);
			else if (e.getSource() == myBankView.getButtonExit())
				buttonExit_ActionPerformed(e);
			else if (e.getSource() == myBankView.getButtonCompanyAccount())
				buttonCompAcc_ActionPerformed(e);
			else if ( e.getSource() == myBankView.getButtonReport())
				buttonReport_ActionPerfomed(e);
		}
	}

	@Override
	public void buttonPersonalAddAccount_ActionPerformed(ActionEvent event) {
		// ICustomer customer =
		// financialFactory.createCustomer(CommonResources.CUSTORMER_PERSON);
		IAccount account;// =
							// financialFactory.createAccount(CommonResources.ACCOUNT_TYPE_DEFAULT);

		// customer.addAccount(account);
		Dialog_AddAccount dialogAdd = new Bank_Dlg_Add_Personal("MyDialog", myBankView,
				financialFactory);
		dialogAdd.setTitle("Add Personal Account");
		dialogAdd.setVisible(true);
		account = dialogAdd.getAccount();
		if (account != null) {
			AccountManager aManager = SingletonFactory.getAccountManager();
			aManager.addAccount(account);
			model.addRow(account.getVector());
			updateView();
		}
		else
			System.out.println("Action Canceld");
		System.out.println("Account should be added");
	}

	private void buttonCompAcc_ActionPerformed(ActionEvent event) {
		
		IAccount account;
		Dialog_AddAccount dialogAdd = new Bank_Dlg_Add_Company("MyDialog", myBankView,
				financialFactory);
		dialogAdd.setTitle("Add Company Account");
		dialogAdd.setVisible(true);
		account = dialogAdd.getAccount();
		if (account != null) {
			AccountManager aManager = SingletonFactory.getAccountManager();
			aManager.addAccount(account);
			model.addRow(account.getVector());
			updateView();
		}
		else
			System.out.println("Action Canceld");
		System.out.println("Add Company Account Added is clicked");
	}
}
