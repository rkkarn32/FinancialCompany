package com.bank.view;

import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

import com.financial.customers.Address;
import com.financial.customers.Person;
import com.financial.factories.IFinancialFactory;
import com.financial.utilities.CommonResources;
import com.financial.view.AbstractFrm;
import com.financial.view.Dialog_AddAccount;

public class Bank_Dlg_Add extends Dialog_AddAccount{

	public Bank_Dlg_Add(String title, AbstractFrm parent, IFinancialFactory financialFactory) {
		super(title, parent, financialFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addFields(Container container){
		super.addFields(container);
		JRadioButton_Chk = new JRadioButton();
		JRadioButton_Sav = new JRadioButton();
		JLabel6 = new JLabel();
		JLabel8 = new JLabel();
		
		
		container.add(JLabel6);
		JLabel6.setForeground(java.awt.Color.black);
		JLabel6.setBounds(12, 216, 96, 24);
		
		JRadioButton_Chk.setText("Checkings");
		JRadioButton_Chk.setActionCommand("Checkings");
		container.add(JRadioButton_Chk);
		JRadioButton_Chk.setBounds(36,12,84,24);
		JRadioButton_Sav.setText("Savings");
		JRadioButton_Sav.setActionCommand("Savings");
		container.add(JRadioButton_Sav);
		JRadioButton_Sav.setBounds(36,36,84,24);
	}
	
	
	@Override
	public void doFurtherWorks(){
		
		Person person = new Person();
		account = financialFactory.createAccount(CommonResources.ACCOUNT_TYPE_DEFAULT);
		account.setAccountHolder(person);
		account.getAccountHolder().setName(txtName.getText());
		Address address = new Address(txtStreet.getText(), txtCity.getText(), txtCity.getText(), Integer.parseInt(txtZip.getText()));
		account.getAccountHolder().setAddress(address);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JRadioButton JRadioButton_Chk = new JRadioButton();
	JRadioButton JRadioButton_Sav = new JRadioButton();
	JLabel JLabel6 = new JLabel();
	JLabel JLabel8 = new JLabel();

}
