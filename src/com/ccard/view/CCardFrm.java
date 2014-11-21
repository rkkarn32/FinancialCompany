package com.ccard.view;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import com.financial.view.DefaultFrm;

public class CCardFrm extends DefaultFrm{
	
	private JButton buttonGenerateBill;// = new JButton();
	private List<JButton> cardButtonList;
	
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
		
		List<JButton> bList = super.getButtons();
		cardButtonList         = new ArrayList<JButton>();
		
		buttonAddAccount.setText("Add Personal Card");
		getButtonReport().setText("Generate bill");
		
		bList.remove(getButtonAddInterest());
		
//		buttonGenerateBill = new JButton();
//		buttonGenerateBill.setText("Deposit");
//		buttonGenerateBill.setBounds(468,104,96,33);
//		buttonList.add(buttonGenerateBill);
		
		cardButtonList.addAll(bList);
		return cardButtonList;
	}
	
	@Override
	public List<JButton> getButtonList() {
		return cardButtonList;
	}
	
	@Override
	public DefaultTableModel getModel() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("CC Number");
		model.addColumn("Name");
		model.addColumn("Exp Date");
		model.addColumn("Type");
		model.addColumn("Balance");
		
		return model;
	}
}
