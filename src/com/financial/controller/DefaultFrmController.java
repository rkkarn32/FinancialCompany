package com.financial.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.financial.interfaces.IAccount;
import com.financial.view.AbstractFrm;
import com.financial.view.DefaultFrm;
import com.financial.view.Dialog_AddAccount;
import com.sun.xml.internal.ws.api.server.Container;

public class DefaultFrmController extends AbstractFrmController{
	
	
	private final ButtonListener listener = new ButtonListener();
	private DefaultFrm myView ;
	
	public DefaultFrmController(List<IAccount> accountList, DefaultFrm view) {
		super(accountList, view);
		myView = view;
		addActionListenerToView();
	}
	
	
	@Override
	public void setView(AbstractFrm view) {
		super.setView(view);
		this.myView= (DefaultFrm)view;
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
		public void c(ActionEvent e) {
			if(e.getSource() == myView.getButtonAddAccount())
					buttonAddAccount_ActionPerformed(e);
			else if(e.getSource() == myView.getButtonAddInterest())
				buttonAddInterest_ActionPerformed(e);
			else if (e.getSource() == myView.getButtonDeposite())
				buttonDeposite_ActionPerfomed(e);
			else if(e.getSource() == myView.getButtonWithDraw())
				buttonWithdraw_ActionPerformed(e);
			else if(e.getSource() == myView .getButtonExit())
				buttonExit_ActionPerformed(e);
		}
	}
	
	public void buttonAddAccount_ActionPerformed(ActionEvent event){
		Dialog_AddAccount addAccount = new Dialog_AddAccount("Default Account",this.myView); 
		addAccount.setVisible(true);
		
		System.out.println("Account should be added");
	}
	private void buttonAddInterest_ActionPerformed(ActionEvent event){
		System.out.println("Add interest is clicked");
	}
	private void buttonDeposite_ActionPerfomed(ActionEvent event){
		System.out.println("Deposite is clicked");
	}
	private void buttonWithdraw_ActionPerformed(ActionEvent event){
		System.out.println("Withdraw is clicked");
	}
	private void buttonExit_ActionPerformed(ActionEvent event){
		System.exit(1);
	}
	
	
	
}
