package com.financial.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class DefaultFrm extends AbstractFrm {

	private static final long serialVersionUID = 1L;
	
	

	JButton buttonDeposite = new JButton();
	JButton buttonWithDraw = new JButton();
	JButton buttonAddInterest= new JButton();
	
	public DefaultFrm(String title) {
		super(title);
		setSize(590, 370);
	}

	@Override
	public List<JButton> getButtons() {
		
		List <JButton> buttonList = new ArrayList<JButton>();
		
		buttonDeposite = new JButton();
		buttonWithDraw = new JButton();
		buttonAddInterest= new JButton();
		
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
	
	@Override
	public DefaultTableModel getModel() {
		return null;
	}

}
