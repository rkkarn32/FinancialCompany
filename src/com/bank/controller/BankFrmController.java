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

	private BankFrm myBankView;

	public BankFrmController(List<IAccount> accountList, BankFrm view) {
		super(accountList, view);
		this.myBankView = view;
		addActionListenerToView();
	}

	@Override
	public void setView(AbstractFrm view) {
		super.setView(view);
		this.myBankView = (BankFrm) view;
	}

	@Override
	public void addActionListenerToView() {
		if (myBankView == null)
			super.addActionListenerToView();
		else
			myBankView.getButtonCompanyAccount().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					buttonCompAcc_ActionPerformed(arg0);
				}
			});
	}


	@Override
	public void buttonPersonalAddAccount_ActionPerformed(ActionEvent event) {
		IAccount account;
		Dialog_AddAccount dialogAdd = new Bank_Dlg_Add_Personal("MyDialog",
				myBankView, financialFactory);
		dialogAdd.setTitle("Add Personal Account");
		dialogAdd.setVisible(true);
		account = dialogAdd.getAccount();
		if (account != null) {
			AccountManager aManager = SingletonFactory.getAccountManager();
			aManager.addAccount(account);
			model.addRow(account.getVector());
			updateView();
		} else
			System.out.println("Action Canceld");
		System.out.println("Account should be added");
	}

	private void buttonCompAcc_ActionPerformed(ActionEvent event) {

		IAccount account;
		Dialog_AddAccount dialogAdd = new Bank_Dlg_Add_Company("MyDialog",
				myBankView, financialFactory);
		dialogAdd.setTitle("Add Company Account");
		dialogAdd.setVisible(true);
		account = dialogAdd.getAccount();
		if (account != null) {
			AccountManager aManager = SingletonFactory.getAccountManager();
			aManager.addAccount(account);
			model.addRow(account.getVector());
			updateView();
		} else
			System.out.println("Action Canceld");
		System.out.println("Add Company Account Added is clicked");
	}
}
