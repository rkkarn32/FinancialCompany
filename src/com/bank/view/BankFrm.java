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
		List<JButton> btnList = super.getButtons();
		buttonList = new ArrayList<JButton>();
		buttonCompanyAccount = new JButton();
		
		buttonCompanyAccount.setText("Add Company Account");
		buttonCompanyAccount.setBounds(240,20,192,33);
		buttonList.add(buttonCompanyAccount);
		btnList.addAll(buttonList);
		return btnList;
	}
	
	
	
	@Override
	public List<JButton> getButtonList() {
		// TODO Auto-generated method stub
		this.buttonList.addAll(super.getButtonList());
		return this.buttonList;
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
