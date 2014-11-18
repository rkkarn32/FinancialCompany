package com.ccard;
import com.financial.account.AbstractAccount;


public class CCard extends AbstractAccount{
	
	//	previous balance: balance from last month 
	//	total charges: total of all charges for this month 
	//	total credits: total of all payments for this month
	//	new balance = previous balance – total credits + total charges + MI * (previous balance 
	//	total credits) 
	//	total due = MP * new balance
	
	private static final double MI = 6;
	private double previousBalance;
	private double totalCharges;
	private double totalCredits;
	private double newBalance;
	private double totalDue;
	
	public CCard(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		// TODO Auto-generated constructor stub
	}
	
	public void generateMonthlyBills(){
		
		newBalance = previousBalance - totalCredits + totalCharges + MI * (previousBalance - totalCredits) ; 
		
	}
	

}
