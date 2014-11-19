package com.bank.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import com.financial.view.DefaultFrm;

public class BankFrm extends DefaultFrm {

	private JButton buttonCompanyAccount;// = new JButton();
	private List <JButton> buttonList;
	

	public BankFrm(String title) {
		super(title);
		
	}
	
	

	public JButton getButtonCompanyAccount() {
		return buttonCompanyAccount;
	}



	public void setButtonCompanyAccount(JButton buttonCompanyAccount) {
		this.buttonCompanyAccount = buttonCompanyAccount;
	}



	/**
	 * 
	 */
	
	
	@Override
	public List<JButton> getButtons() {
		
		buttonList = new ArrayList<JButton>();
		
		
		buttonCompanyAccount = new JButton();
		
		buttonCompanyAccount.setText("Add Company Account");
		buttonCompanyAccount.setBounds(468,104,96,33);
		buttonList.add(buttonCompanyAccount);
		
		
		return buttonList;
		
	}
	
	@Override
	public List<JButton> getButtonList() {
		// TODO Auto-generated method stub
		super.getButtonList().addAll(this.buttonList);
		return super.getButtonList();
	}
	
	@Override
	public DefaultTableModel getModel() {
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("AccountNr ");
		model.addColumn("Name");
		model.addColumn("City");
		model.addColumn("P/C");
		model.addColumn("Ch/S");
		model.addColumn("Amount");
		
		return model;
	}

}
