package com.financial.controller;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.financial.factories.IFinancialFactory;
import com.financial.interfaces.IAccount;
import com.financial.view.AbstractFrm;

public abstract class AbstractFrmController implements IFrmController {
	
	protected DefaultTableModel model;
	protected AbstractFrm view;
	protected  List<IAccount> accountList;
	protected IFinancialFactory financialFactory;
	public AbstractFrmController(List<IAccount> accountList, AbstractFrm view) {
		super();
		this.accountList = accountList;
		this.view = view;
		for (IAccount iAccount : accountList) {
			this.model.addRow(iAccount.getVector());
		}
	}

	@Override
	public void setView(AbstractFrm view) {
		this.view = view;
	}

	@Override
	public void updateView() {
		view.updateView(model);
		if(!view.isVisible())
			view.setVisible(true);
	}

	@Override
	public void setModel(List<IAccount> accountList) {
		this.accountList = accountList;
		for (IAccount iAccount : accountList) {
			this.model.addRow(iAccount.getVector());
		}
	}

	@Override
	public List<IAccount> getModel() {
		return this.accountList;
	}

	public void setFinancialFactory(IFinancialFactory factory){
		this.financialFactory= factory;
	}

}
