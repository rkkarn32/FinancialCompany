package com.financial.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import com.financial.interfaces.IAccount;
import com.financial.view.AbstractFrm;
import com.financial.view.DefaultFrm;

public abstract class AbstractFrmController implements IFrmController {
	
	protected DefaultTableModel model;
	protected AbstractFrm view;
	protected  List<IAccount> accountList;
	
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

	

}
