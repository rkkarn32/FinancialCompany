package com.bank.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import com.bank.view.BankFrm;
import com.financial.controller.DefaultFrmController;
import com.financial.interfaces.IAccount;
import com.financial.view.AbstractFrm;
import com.financial.view.DefaultFrm;


public class BankFrmController extends DefaultFrmController{

	
	private final ButtonListener listener = new ButtonListener();
	private BankFrm myBankView;

	
	
	
	public BankFrmController(List<IAccount> accountList, DefaultFrm view) {
		super(accountList, view);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setView(AbstractFrm view) {
		super.setView(view);
		this.myBankView= (BankFrm)view;
	}
	

	@Override
	public void addActionListenerToView() {
		//view.getButtonAddAccount().addActionListener(listener);
		for (JButton button: view.getButtonList()) {
			button.addActionListener(listener);
			System.out.println();
		}
	}
	
	public class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == myBankView.getButtonCompanyAccount())
				buttonNewButton_ActionPerformed(e);
			
			
		}
	}
	
	private void buttonNewButton_ActionPerformed(ActionEvent event){
		System.out.println("Add Company Account Added is clicked");
	}
	
	

}
