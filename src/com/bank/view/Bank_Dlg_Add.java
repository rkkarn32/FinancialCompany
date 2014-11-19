package com.bank.view;

import java.awt.Container;

import com.financial.customers.Address;
import com.financial.customers.Person;
import com.financial.factories.FinancialFactory;
import com.financial.factories.IFinancialFactory;
import com.financial.interfaces.IAccount;
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

}
