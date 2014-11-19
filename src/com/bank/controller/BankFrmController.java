package com.bank.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import com.bank.view.BankFrm;
import com.bank.view.Bank_Dlg_Add;
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
				buttonAddAccount_ActionPerformed(e);
			else if (e.getSource() == myBankView.getButtonAddInterest())
				buttonAddInterest_ActionPerformed(e);
			else if (e.getSource() == myBankView.getButtonDeposite())
				buttonDeposite_ActionPerfomed(e);
			else if (e.getSource() == myBankView.getButtonWithDraw())
				buttonWithdraw_ActionPerformed(e);
			else if (e.getSource() == myBankView.getButtonExit())
				buttonExit_ActionPerformed(e);
			else if (e.getSource() == myBankView.getButtonCompanyAccount())
				buttonNewButton_ActionPerformed(e);
		}
	}
	
	@Override
	public void buttonAddAccount_ActionPerformed(ActionEvent event){
		//ICustomer customer = financialFactory.createCustomer(CommonResources.CUSTORMER_PERSON);
		IAccount account = financialFactory.createAccount(CommonResources.ACCOUNT_TYPE_DEFAULT);

		//customer.addAccount(account);
		Dialog_AddAccount dialogAdd = new Bank_Dlg_Add("MyDialog", myBankView, financialFactory);
		
		dialogAdd.setVisible(true);
		
		AccountManager aManager = SingletonFactory.getAccountManager();
		aManager.addAccount(account);
		model.addRow(account.getVector());
		updateView();
		System.out.println("Account should be added");
	}

	private void buttonNewButton_ActionPerformed(ActionEvent event) {
		System.out.println("Add Company Account Added is clicked");
	}
}
