package com.financial.customers;

import java.util.List;

import com.financial.interfaces.IAccount;

public abstract class Customer implements ICustomer {

	private String name;
	private String email;
	private List<IAccount> accountList;
	private String type;
	private IAddress address;
	
	public IAddress getAddress() {
		return address;
	}

	public void setAddress(IAddress address) {
		this.address = address;
	}

	public List<IAccount> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<IAccount> accountList) {
		this.accountList = accountList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public void showInfo() {
		System.out.println("Customer ");
		System.out.println("Name: " + getName());
		System.out.println("Type of Customer:    "+getType());
		System.out.println("Email: "+ getEmail());
		System.out.println("Address of Customer :");
		System.out.println("Street Name" );
		System.out.println("City  Name" );
		System.out.println("State Name" );
		System.out.println(" Zip Code" );
		
		System.out.println("Email: "+ getEmail());
		for (IAccount a:accountList)
		{
			System.out.println();
		}
			
	}

	
	@Override
	public void addAccount(IAccount account) {
		this.accountList.add(account);

	}

	
	@Override
	public void removeAccount(IAccount account) {
		this.accountList.remove(account);

	}

	
	@Override
	public void update() {
		
		
		

	}

	

}
