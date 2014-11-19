package com.ccard.view;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import com.financial.view.DefaultFrm;

public class CCardFrm extends DefaultFrm{
	
	private JButton buttonGenerateBill;// = new JButton();
	private List<JButton> buttonList;
	

	public CCardFrm(String title) {
		super(title);
		
	}
	

	public JButton getButtonGenerateBill() {
		return buttonGenerateBill;
	}


	public void setButtonGenerateBill(JButton buttonGenerateBill) {
		this.buttonGenerateBill = buttonGenerateBill;
	}


	/**
	 * 
	 */
	
	
	@Override
	public List<JButton> getButtons() {
		
		buttonList = new ArrayList<JButton>();
		
		
		buttonGenerateBill = new JButton();
		
		buttonGenerateBill.setText("Deposit");
		buttonGenerateBill.setBounds(468,104,96,33);
		buttonList.add(buttonGenerateBill);
		
		
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
		
		model.addColumn("Name");
		model.addColumn("CC Number");
		model.addColumn("Exp Date");
		model.addColumn("Type");
		model.addColumn("Balance");
		
		return model;
	}

}
