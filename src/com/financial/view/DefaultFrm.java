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
	
	

	private JButton buttonDeposite = new JButton();
	private JButton buttonWithDraw = new JButton();
	private JButton buttonAddInterest= new JButton();
	private JButton buttonExit;
	private JButton buttonAddAccount;
	
	public DefaultFrm(String title) {
		super(title);
		setSize(600, 310);
	}

	@Override
	public List<JButton> getButtons() {
		
		List <JButton> buttonList = new ArrayList<JButton>();
		
		buttonDeposite = new JButton();
		buttonWithDraw = new JButton();
		buttonAddInterest= new JButton();
		buttonExit = new JButton();
		buttonAddAccount = new JButton();
		
		buttonDeposite.setText("Deposit");
		buttonDeposite.setBounds(468,104,96,33);
		buttonDeposite.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				buttonDeposite_ActionPerfomed(arg0);
			}
		});
		buttonList.add(buttonDeposite);
		
		buttonWithDraw.setText("Withdraw");
		buttonWithDraw.setBounds(468,164,96,33);
		buttonWithDraw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				buttonWithdraw_ActionPerformed(arg0);
			}
		});
		buttonList.add(buttonWithDraw);
		
		buttonAddInterest.setBounds(468,20,106,33);
		buttonAddInterest.setText("Add interest");
		buttonAddInterest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				buttonAddInterest_ActionPerformed(arg0);
			}
		});
		buttonList.add(buttonAddInterest);
		
		buttonExit.setText("Exit");
		buttonExit.setBounds(468, 248,96,31);
		buttonExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonExit_ActionPerformed(e);
			}
		});
		
		buttonAddAccount.setText("Add Account");
		buttonAddAccount.setBounds(50,20,192,33);
		buttonAddAccount.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Account Will be added");
				
			}
		});
		buttonList.add(buttonAddAccount);
		
		buttonList.add(buttonExit);
		return buttonList;
	}
	
	public void buttonAddInterest_ActionPerformed(ActionEvent event){
		System.out.println("Add interest is clicked");
	}
	public void buttonDeposite_ActionPerfomed(ActionEvent event){
		System.out.println("Deposite is clicked");
	}
	public void buttonWithdraw_ActionPerformed(ActionEvent event){
		System.out.println("Withdraw is clicked");
	}
	public void buttonExit_ActionPerformed(ActionEvent event){
		System.exit(1);
	}
	
	@Override
	public DefaultTableModel getModel() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("A/N");
		model.addColumn("Name");
		model.addColumn("Balance");
		
		return model;
	}

}
