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

	protected JButton buttonDeposite;// = new JButton();
	protected JButton buttonWithDraw;// = new JButton();
	protected JButton buttonAddInterest;//= new JButton();
	protected JButton buttonExit;
	protected JButton buttonAddAccount;
	protected JButton buttonReport;
	
	private List <JButton> buttonList;
	
	public DefaultFrm(String title) {
		super(title);
		setSize(620, 350);
		
	}

	@Override
	public List<JButton> getButtons() {
		
		buttonList = new ArrayList<JButton>();
		
		buttonDeposite = new JButton();
		buttonWithDraw = new JButton();
		buttonAddInterest= new JButton();
		buttonExit = new JButton();
		buttonAddAccount = new JButton();
		buttonReport = new JButton();
		
		buttonAddAccount.setText("Add Account");
		buttonAddAccount.setBounds(20,20,150,33);
		buttonList.add(buttonAddAccount);
		
		buttonAddInterest.setBounds(468,20,120,33);
		buttonAddInterest.setText("Add interest");
		buttonList.add(buttonAddInterest);
		
		buttonDeposite.setText("Deposit");
		buttonDeposite.setBounds(468,60,120,33);
		buttonList.add(buttonDeposite);
		
		buttonWithDraw.setText("Withdraw");
		buttonWithDraw.setBounds(468,100,120,33);
		buttonList.add(buttonWithDraw);
		
		buttonReport.setText("ShowReport");
		buttonReport.setBounds(468, 140, 120, 33);
		buttonList.add(buttonReport);
		
		buttonExit.setText("Exit");
		buttonExit.setBounds(468, 248,120,31);
		buttonList.add(buttonExit);
		
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
	public JButton getButtonReport(){
		return buttonReport;
	}
}
