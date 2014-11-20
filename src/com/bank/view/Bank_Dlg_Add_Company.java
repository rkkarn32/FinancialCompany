package com.bank.view;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.bank.Utils;
import com.financial.customers.Address;
import com.financial.customers.ICustomer;
import com.financial.customers.Person;
import com.financial.factories.IFinancialFactory;
import com.financial.utilities.CommonResources;
import com.financial.view.AbstractFrm;
import com.financial.view.Dialog_AddAccount;
import com.sun.org.apache.bcel.internal.generic.IUSHR;

public class Bank_Dlg_Add_Company extends Dialog_AddAccount{

	public Bank_Dlg_Add_Company(String title, AbstractFrm parent, IFinancialFactory financialFactory) {
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
		JTextField_NumberEmp = new JTextField();
		buttonGroup = new ButtonGroup();
		
		buttonGroup.add(JRadioButton_Chk);
		buttonGroup.add(JRadioButton_Sav);
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
		
		JLabel6.setText("Num EMP");
		container.add(JLabel6);
		container.add(JTextField_NumberEmp);
		JTextField_NumberEmp.setBounds(120,216,156,20);
	}
	
	@Override
	public void doFurtherWorks(){
		
		ICustomer customer = financialFactory.createCustomer(CommonResources.CUSTORMER_COMPANY);
		ButtonModel b = buttonGroup.getSelection();
		String name = b.getActionCommand();
		if (name.equals(Utils.ACCOUNT_TYPE_CHECKING)) 
			account = financialFactory.createAccount(Utils.ACCOUNT_TYPE_CHECKING);
		else
			account = financialFactory.createAccount(Utils.ACCOUNT_TYPE_SAVING);
		account.setAccountHolder(customer);
		account.getAccountHolder().setName(txtName.getText());
		Address address = new Address(txtStreet.getText(), txtCity.getText(), txtCity.getText(), Integer.parseInt(txtZip.getText()));
		account.getAccountHolder().setAddress(address);
		account.getAccountHolder().setEmail(txtEmail.getText());
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JRadioButton JRadioButton_Chk = new JRadioButton();
	JRadioButton JRadioButton_Sav = new JRadioButton();
	JLabel JLabel6 = new JLabel();
	JLabel JLabel8 = new JLabel();
	ButtonGroup buttonGroup;
	
	JLabel jLabel9 = new JLabel();
	javax.swing.JTextField JTextField_NumberEmp = new javax.swing.JTextField();

}
