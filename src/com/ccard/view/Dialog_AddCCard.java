package com.ccard.view;

import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.ccard.CreditCardCommonResources;
import com.financial.customers.Address;
import com.financial.customers.IAddress;
import com.financial.customers.ICustomer;
import com.financial.factories.IFinancialFactory;
import com.financial.interfaces.IAccount;
import com.financial.utilities.CommonResources;
import com.financial.view.AbstractFrm;
import com.financial.view.Dialog_AddAccount;

public class Dialog_AddCCard extends Dialog_AddAccount{

	
	JRadioButton radioGold;
	JRadioButton radioSilver;
	JRadioButton radioBronze;
	JLabel lblExpDate;
	JTextField txtExpDate;
	IAccount account ;
	
	public Dialog_AddCCard(String title, AbstractFrm parent,
			IFinancialFactory financialFactory) {
		super(title, parent, financialFactory);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public IAccount getAccount(){
		return this.account;
	}
	
	@Override
	public void addFields(Container container){
		super.addFields(container);
		
		radioGold = new JRadioButton();
		radioSilver = new JRadioButton();
		radioBronze = new JRadioButton();
		lblExpDate = new JLabel();
		txtExpDate = new JTextField();
		
		radioGold.setText("Gold");
		radioGold.setActionCommand("Checkings");
		getContentPane().add(radioGold);
		radioGold.setBounds(36,12,84,24);
		radioSilver.setText("Silver");
		radioSilver.setActionCommand("Savings");
		getContentPane().add(radioSilver);
		radioSilver.setBounds(36,36,84,24);
		radioBronze.setText("Bronze");
		radioBronze.setActionCommand("Savings");
		getContentPane().add(radioBronze);
		radioBronze.setBounds(36,60,84,24);
		
		lblExpDate.setText("Exp. Date");
		getContentPane().add(lblExpDate);
		lblExpDate.setForeground(java.awt.Color.black);
		lblExpDate.setBounds(12,215,72,24);
		
		getContentPane().add(txtExpDate);
		txtExpDate.setBounds(120,215,156,20);
		
	}
	
	@Override
	public void doFurtherWorks(){
		if(radioBronze.isSelected())
			account = financialFactory.createAccount(CreditCardCommonResources.CREDITCARD_BRONZE);
		else if(radioSilver.isSelected())
			account = financialFactory.createAccount(CreditCardCommonResources.CREDITCARD_SILVER);
		else 
			account = financialFactory.createAccount(CreditCardCommonResources.CREDITCARD_GOLD);
		ICustomer customer = financialFactory.createCustomer(CommonResources.CUSTORMER_PERSON);
		customer.setEmail(txtEmail.getText());
		customer.setName(txtName.getText());
		IAddress address = new Address(txtStreet.getText(), txtCity.getText(), txtState.getText(), Integer.parseInt(txtZip.getText()));
		customer.setAddress(address);
		account.setAccountHolder(customer);
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
