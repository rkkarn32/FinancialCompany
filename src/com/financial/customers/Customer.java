package com.financial.customers;

import java.util.ArrayList;
import java.util.List;

import com.financial.interfaces.IAccount;

public abstract class Customer implements ICustomer {

	private String name;
	private String email;
	private List<IAccount> accountList;
	private String type;
	private IAddress address;

	// Default Customer
	public Customer() {
		this.accountList = new ArrayList<IAccount>();
	}

	public Customer(String name, String email, String type, IAddress address) {
		super();
		this.name = name;
		this.email = email;
		this.type = type;
		this.address = address;
		this.accountList = new ArrayList<IAccount>();
	}

	private static int id = 0;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Customer.id = id;
	}

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
	public String toString() {
		return "Name: " + getName() + "Type of Customer: " + getType()
				+ "Email: " + getEmail();
	}

	@Override
	public void showInfo() {
		System.out.println("Customer ");
		System.out.println("Name: " + getName());
		System.out.println("Type of Customer:    " + getType());
		System.out.println("Email: " + getEmail());

		System.out.println("Address of Customer :");
		System.out.println("Street Name" + address.getState());
		System.out.println("City  Name" + address.getCity());
		System.out.println("State Name" + address.getState());
		System.out.println(" Zip Code" + address.getZip());

		System.out.println("Account Informations");

		for (IAccount a : accountList) {
			System.out.println(a.getAccountNumber());
			System.out.println(a.getAccountType());
			System.out.println(a.getBalance());
			System.out.println(a.getAccountHolder());
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
