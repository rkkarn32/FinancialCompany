package com.financial.customers;

import java.util.Date;

import com.financial.interfaces.IAccount;

public interface ICustomer {
	void showInfo();
	void addAccount(IAccount account);
	void removeAccount(IAccount account);
	void update();
	public String getEmail();
	String getType();
	String toString();
	public String getName();
	
	public void setDateofbirth(Date dateofbirth);
	public void setNumofEmp(int numofEmp);
	public void setAddress(IAddress address);
	public void setType(String type);
	public void setName(String name) ;
	public void setEmail(String email);
}
