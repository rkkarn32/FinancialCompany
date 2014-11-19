package com.financial.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import sun.font.CreatedFontTracker;

import com.financial.account.AccountManager;
import com.financial.account.CalculateInterestFunctor;
import com.financial.account.Functor;
import com.financial.customers.ICustomer;
import com.financial.factories.SingletonFactory;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;
import com.financial.view.AbstractFrm;
import com.financial.view.DefaultFrm;
import com.financial.view.Dialog_AddAccount;

public class DefaultFrmController extends AbstractFrmController{
	
	
	private final ButtonListener listener = new ButtonListener();
	private DefaultFrm myView ;
	private List<JButton> buttonList = new ArrayList<JButton>();
	
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
		for (JButton button: myView.getButtonList()) {
			button.addActionListener(listener);
			System.out.println();
		}
	}
	
	public class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == myView.getButtonAddAccount())
					buttonPersonalAddAccount_ActionPerformed(e);
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
	
	public void buttonPersonalAddAccount_ActionPerformed(ActionEvent event){ 
		
		//ICustomer customer = financialFactory.createCustomer(CommonResources.CUSTORMER_PERSON);
		IAccount account;// = financialFactory.createAccount(CommonResources.ACCOUNT_TYPE_DEFAULT);

		//customer.addAccount(account);
		Dialog_AddAccount dialogAdd = new Dialog_AddAccount("MyDialog", myView,  financialFactory);
		dialogAdd.setVisible(true);
		AccountManager aManager = SingletonFactory.getAccountManager();
		account = dialogAdd.getAccount();
		aManager.addAccount(account);
		model.addRow(account.getVector());
		updateView();
		System.out.println("Account should be added");
	}
	public void buttonAddInterest_ActionPerformed(ActionEvent event){
		AccountManager accMan = SingletonFactory.getAccountManager();
		Functor<IAccount, Double> calInterest = new CalculateInterestFunctor(); 
		accMan.addInterest(calInterest);
		updateView();
		System.out.println("Add interest is clicked");
	}
	public void buttonDeposite_ActionPerfomed(ActionEvent event){
		System.out.println("Deposite is clicked");
	}
	public void buttonWithdraw_ActionPerformed(ActionEvent event){
		System.out.println("Withdraw is clicked");
	}
	public void buttonGenerateReport_ActionPerformed(ActionEvent event){
		System.out.println("Report:");
	}
	public void buttonExit_ActionPerformed(ActionEvent event){
		System.exit(1);
	}
	
	
	
}
