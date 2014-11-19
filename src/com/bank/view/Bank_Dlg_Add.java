package com.bank.view;

import com.financial.customers.Address;
import com.financial.customers.Person;
import com.financial.interfaces.IAccount;
import com.financial.view.AbstractFrm;
import com.financial.view.Dialog_AddAccount;

public class Bank_Dlg_Add extends Dialog_AddAccount{

	public Bank_Dlg_Add(String title, AbstractFrm parent, IAccount account) {
		super(title, parent, account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doFurtherWorks(){
		
		
		Person person = new Person();
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
