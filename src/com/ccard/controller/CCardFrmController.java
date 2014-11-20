package com.ccard.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import com.ccard.CreditCardAccount;
import com.ccard.view.CCardFrm;
import com.financial.controller.DefaultFrmController;
import com.financial.controller.DefaultFrmController.ButtonListener;
import com.financial.interfaces.IAccount;
import com.financial.view.AbstractFrm;
import com.financial.view.DefaultFrm;
import com.financial.view.Dialog_Report;

public class CCardFrmController extends DefaultFrmController {
	private final ButtonListener listener = new ButtonListener();
	
	private CCardFrm myCCardView;

	public CCardFrmController(List<IAccount> accountList, CCardFrm view) {
		super(accountList, view);
//		view.getButtonAddAccount().setText("Add Credit Card");
	}
	
	@Override
	public void setView(AbstractFrm view) {
		super.setView(view);
		this.myCCardView= (CCardFrm) view;
	}
	
	@Override
	public void addActionListenerToView() {
		for (JButton button: view.getButtonList()) {
			button.addActionListener(listener);
			System.out.println();
		}
	}
	
	public class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == myCCardView.getButtonAddAccount())
				buttonPersonalAddAccount_ActionPerformed(e);
		else if(e.getSource() == myCCardView.getButtonAddInterest())
			buttonAddInterest_ActionPerformed(e);
		else if (e.getSource() == myCCardView.getButtonDeposite())
			buttonDeposite_ActionPerfomed(e);
		else if(e.getSource() == myCCardView.getButtonWithDraw())
			buttonWithdraw_ActionPerformed(e);
		else if(e.getSource() == myCCardView .getButtonExit())
			buttonExit_ActionPerformed(e);
		else if ( e.getSource() == myCCardView.getButtonReport())
			buttonReport_ActionPerfomed(e);
		}
	}
	
	@Override
	public void buttonReport_ActionPerfomed(ActionEvent event ){
		System.out.println("Report is printing");
		int num = myCCardView.getTable().getSelectionModel().getMinSelectionIndex();
		if(num>=0)
		{
			String accNum = (String) model.getValueAt(num, 0);
			IAccount account = accountManager.getAccountByAccountNumber(accNum);
			CreditCardAccount cAccount = (CreditCardAccount) account;
			//System.out.println(account.generateReport());
			Dialog_Report dlgReport = new Dialog_Report(myCCardView, cAccount.generateMonthlyBills());
			dlgReport.setTitle("Report view");
			dlgReport.setVisible(true);
			
		}
	}
}
