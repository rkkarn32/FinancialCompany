package com.financial.controller;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.financial.account.AccountManager;
import com.financial.factories.IFinancialFactory;
import com.financial.factories.SingletonFactory;
import com.financial.interfaces.IAccount;
import com.financial.interfaces.ITransactionManager;
import com.financial.view.AbstractFrm;

public abstract class AbstractFrmController implements IFrmController {
	
	protected DefaultTableModel model= new DefaultTableModel();
	protected AccountManager accountManager;
	protected AbstractFrm view;
	protected  List<IAccount> accountList;
	protected IFinancialFactory financialFactory;
	protected ITransactionManager transactionManager;
	
	public AbstractFrmController(List<IAccount> accountList, AbstractFrm view) {
		super();
		accountManager = SingletonFactory.getAccountManager();
		transactionManager = SingletonFactory.getTransactionManager();
		this.accountList = accountList;
		this.view = view;
		if(accountList != null)
		for (IAccount iAccount : accountList) {
			System.out.println(iAccount.getVector());
			this.model.addRow(iAccount.getVector());
		}
	}

	@Override
	public void setView(AbstractFrm view) {
		this.view = view;
	}

	@Override
	public void updateView() {
		//model = new DefaultTableModel();
		model = view.getModel();
		AccountManager accountManager = SingletonFactory.getAccountManager();
		List<IAccount> accountList = accountManager.getDaoAccount().getAll();
		for(IAccount acc:accountList)
			model.addRow(acc.getVector());
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
