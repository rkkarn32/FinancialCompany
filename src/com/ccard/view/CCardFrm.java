package com.ccard.view;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import com.financial.view.DefaultFrm;

public class CCardFrm extends DefaultFrm{
	
	private List<JButton> cardButtonList;
	
	public CCardFrm(String title) {
		super(title);
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
