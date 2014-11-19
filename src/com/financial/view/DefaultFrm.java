package com.financial.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DefaultFrm extends AbstractFrm {

	private static final long serialVersionUID = 1L;

	private JButton buttonDeposite;// = new JButton();
	private JButton buttonWithDraw;// = new JButton();
	private JButton buttonAddInterest;//= new JButton();
	private JButton buttonExit;
	private JButton buttonAddAccount;
	
	private List <JButton> buttonList;
	
	public DefaultFrm(String title) {
		super(title);
		setSize(600, 310);
		
	}

	@Override
	public List<JButton> getButtons() {
		
		buttonList = new ArrayList<JButton>();
		
		buttonDeposite = new JButton();
		buttonWithDraw = new JButton();
		buttonAddInterest= new JButton();
		buttonExit = new JButton();
		buttonAddAccount = new JButton();
		
		buttonDeposite.setText("Deposit");
		buttonDeposite.setBounds(468,104,96,33);
		buttonList.add(buttonDeposite);
		
		buttonWithDraw.setText("Withdraw");
		buttonWithDraw.setBounds(468,164,96,33);
		buttonList.add(buttonWithDraw);
		
		buttonAddInterest.setBounds(468,20,106,33);
		buttonAddInterest.setText("Add interest");
		buttonList.add(buttonAddInterest);
		
		buttonExit.setText("Exit");
		buttonExit.setBounds(468, 248,96,31);
		buttonList.add(buttonExit);
		

		buttonAddAccount.setText("Add Account");
		buttonAddAccount.setBounds(50,20,192,33);
		buttonList.add(buttonAddAccount);
		
		return buttonList;
	}
	
	@Override
	public List<JButton> getButtonList() {
		// TODO Auto-generated method stub
		return this.buttonList;
	}
	
	
	@Override
	public DefaultTableModel getModel() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("A/N");
		model.addColumn("Name");
		model.addColumn("Balance");
		
		return model;
	}


	public JButton getButtonDeposite() {
		return buttonDeposite;
	}

	public JButton getButtonWithDraw() {
		return buttonWithDraw;
	}

	public JButton getButtonAddInterest() {
		return buttonAddInterest;
	}

	public JButton getButtonExit() {
		return buttonExit;
	}

	public JButton getButtonAddAccount() {
		return buttonAddAccount;
	}
}
