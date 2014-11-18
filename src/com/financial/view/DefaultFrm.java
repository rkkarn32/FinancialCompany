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
	}

	@Override
	public List<JButton> getButtons() {
		
		List <JButton> buttonList = new ArrayList<JButton>();
		
		buttonDeposite = new JButton();
		buttonWithDraw = new JButton();
		buttonAddInterest= new JButton();
		
		buttonDeposite.setText("Deposit");
		buttonDeposite.setBounds(468,104,96,33);
		buttonList.add(buttonDeposite);
		
		buttonWithDraw.setText("Withdraw");
		buttonWithDraw.setBounds(468,164,96,33);
		buttonList.add(buttonWithDraw);
		
		buttonAddInterest.setBounds(448,20,106,33);
		buttonAddInterest.setText("Add interest");
		buttonList.add(buttonAddInterest);
		
		return buttonList;
	}

	@Override
	public DefaultTableModel getModel() {
		return null;
	}

}
