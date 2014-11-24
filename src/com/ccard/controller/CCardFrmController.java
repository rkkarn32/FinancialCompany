package com.ccard.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import com.ccard.account.CreditCardAccount;
import com.ccard.view.CCardFrm;
import com.ccard.view.Dialog_AddCCard;
import com.financial.account.AccountManager;
import com.financial.controller.DefaultFrmController;
import com.financial.factories.SingletonFactory;
import com.financial.interfaces.IAccount;
import com.financial.view.AbstractFrm;
import com.financial.view.Dialog_AddAccount;
import com.financial.view.Dialog_Report;

public class CCardFrmController extends DefaultFrmController {

	private CCardFrm myCCardView;

	public CCardFrmController(List<IAccount> accountList, CCardFrm view) {
		super(accountList, view);
		myCCardView = view;
	}

	@Override
	public void setView(AbstractFrm view) {
		super.setView(view);
		this.myCCardView = (CCardFrm) view;
	}

	@Override
	public void addActionListenerToView() {
		
		super.addActionListenerToView();
	}

	@Override
	public void buttonPersonalAddAccount_ActionPerformed(ActionEvent event) {
		Dialog_AddAccount dialogAdd = new Dialog_AddCCard("MyDialog", myCCardView ,financialFactory);
		dialogAdd.setVisible(true);
		accountManager.addAccount(dialogAdd.getAccount());
		updateView();
		System.out.println("Account should be added");
	}

	@Override
	public void buttonReport_ActionPerfomed(ActionEvent event) {
		System.out.println("Report is printing");
		int num = myCCardView.getTable().getSelectionModel()
				.getMinSelectionIndex();
		if (num >= 0) {
			String accNum = (String) model.getValueAt(num, 0);
			IAccount account = accountManager.getAccountByAccountNumber(accNum);
			CreditCardAccount cAccount = (CreditCardAccount) account;
			// System.out.println(account.generateReport());
			Dialog_Report dlgReport = new Dialog_Report(myCCardView,
					cAccount.generateMonthlyBills());
			dlgReport.setTitle("Report view");
			dlgReport.setVisible(true);

		}
	}
}
