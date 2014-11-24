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
import com.financial.interfaces.ITransaction;
import com.financial.transaction.Deposite;
import com.financial.utilities.CommonResources;
import com.financial.view.AbstractFrm;
import com.financial.view.DefaultFrm;
import com.financial.view.Dialog_AddAccount;
import com.financial.view.Dialog_Deposit;
import com.financial.view.Dialog_Report;

public class DefaultFrmController extends AbstractFrmController{
	
	
	private  ButtonListener listener;
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
		listener = new ButtonListener();
		myView.getButtonAddAccount().addActionListener(listener);
		myView.getButtonAddInterest().addActionListener(listener);
		myView.getButtonDeposite().addActionListener(listener);
		myView.getButtonExit().addActionListener(listener);
		myView.getButtonReport().addActionListener(listener);
		myView.getButtonWithDraw().addActionListener(listener);
		
	}
	
	private class ButtonListener implements ActionListener{

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
			else if ( e.getSource() == myView.getButtonReport())
				buttonReport_ActionPerfomed(e);
		}
	}
	
	public void buttonPersonalAddAccount_ActionPerformed(ActionEvent event){ 
		
		IAccount account;
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
		ITransaction deposite = financialFactory.createTransaction(CommonResources.TEXT_DEPOSIT);
		
		 int selection = myView.getTable().getSelectionModel().getMinSelectionIndex();
	        if (selection >=0){
		{
			
			String accnr = (String)model.getValueAt(selection, 0);
			Dialog_Deposit dlgDeposite = new Dialog_Deposit(myView, accnr);
			AccountManager accMgr = SingletonFactory.getAccountManager();
			IAccount acc = accMgr.getAccountByAccountNumber(accnr);
			dlgDeposite.setVisible(true);
			deposite.setAccount(acc);
			deposite.setAmount(dlgDeposite.getRetVal());
			transactionManager.performOperation(deposite);
			updateView();
			
		}			
		}
		System.out.println("Deposite is clicked");
	}
	public void buttonWithdraw_ActionPerformed(ActionEvent event){
		ITransaction withDraw = financialFactory.createTransaction(CommonResources.TEXT_WITHDRAW);
		
		 int selection = myView.getTable().getSelectionModel().getMinSelectionIndex();
	        if (selection >=0){
		{
			String accnr = (String)model.getValueAt(selection, 0);
			Dialog_Deposit dlgDeposite = new Dialog_Deposit(myView, accnr);
			AccountManager accMgr = SingletonFactory.getAccountManager();
			IAccount acc = accMgr.getAccountByAccountNumber(accnr);
			System.out.println("account :: " + acc + "withdraw" + withDraw);
			dlgDeposite.setVisible(true);
			withDraw.setAccount(acc);
			withDraw.setAmount(dlgDeposite.getRetVal());
			transactionManager.performOperation(withDraw);
			updateView();
		}			
		}
		System.out.println("Deposite is clicked");
	}
	
	public void buttonReport_ActionPerfomed(ActionEvent event){
		System.out.println("Report is printing");
		int num = myView.getTable().getSelectionModel().getMinSelectionIndex();
		if(num>=0)
		{
			String accNum = (String) model.getValueAt(num, 0);
			IAccount account = accountManager.getAccountByAccountNumber(accNum);
			//System.out.println(account.generateReport());
			Dialog_Report dlgReport = new Dialog_Report(myView, account.generateReport());
			dlgReport.setTitle("Report view");
			dlgReport.setVisible(true);
			
		}
	}
	public void buttonGenerateReport_ActionPerformed(ActionEvent event){
		System.out.println("Report:");
	}
	public void buttonExit_ActionPerformed(ActionEvent event){
		System.exit(1);
	}
}
