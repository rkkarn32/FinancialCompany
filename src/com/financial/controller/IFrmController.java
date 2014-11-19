package com.financial.controller;

import java.util.List;

import com.financial.factories.IFinancialFactory;
import com.financial.interfaces.IAccount;
import com.financial.view.AbstractFrm;

public interface IFrmController {
	void addActionListenerToView();
	void setView(AbstractFrm view);
	void setModel(List<IAccount> model);
	List<IAccount> getModel();
	void updateView();
	void setFinancialFactory(IFinancialFactory factory);
}
