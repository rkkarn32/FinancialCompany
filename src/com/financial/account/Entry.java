package com.financial.account;

import java.util.Date;

public class Entry {
	
	private double amount;
	private Date entryDate;
	private String entryInfo;
	
	public Entry(double amount, Date entryDate, String entryInfo) {
		this.amount    = amount;
		this.entryDate = entryDate;
		this.entryInfo = entryInfo;
	}
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getEntryInfo() {
		return entryInfo;
	}

	public void setEntryInfo(String entryInfo) {
		this.entryInfo = entryInfo;
	}
	
	public String toString(){
		return "Entry {" + "Amount = " + this.amount + ", EntryDate = "
				+ this.entryDate.toString() + "Type " + this.entryInfo + '}';
	}

}
