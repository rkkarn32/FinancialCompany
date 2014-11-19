package com.ccard;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

import com.financial.account.AbstractAccount;
import com.financial.account.Entry;
import com.financial.utilities.CommonResources;
import com.sun.xml.internal.fastinfoset.CommonResourceBundle;

public abstract class CreditCardAccount extends AbstractAccount {

	// previous balance: balance from last month
	// total charges: total of all charges for this month
	// total credits: total of all payments for this month
	// new balance = previous balance � total credits + total charges + MI *
	// (previous balance
	// total credits)
	// total due = MP * new balance

	private static double MI;
	private static double MP;
	private double previousBalance;
	private double totalCharges;
	private double totalCredits;
	private double newBalance;
	private double totalDue;
	private Date expDate;
	private String accountType;
	
	public  void setAccountType(String accountType){
		this.accountType = accountType;
	}
		
	
	
	
	private Vector returnVector;
	
	public Date getExpDate() {
		return expDate;
	}


	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}


	public Vector getVector() {
		returnVector.add(super.getAccountHolder().getName());
		returnVector.add(super.getAccountNumber());
		returnVector.add(expDate);
		returnVector.add(super.getAccountType());		
		returnVector.add(super.getBalance());
		return returnVector;
	}
	

	public CreditCardAccount(double initialBalance, String creditCardType) {
		super(initialBalance, creditCardType);

	}

	public StringBuilder generateMonthlyBills() {
		
		
	
		Calendar aCalendar = Calendar.getInstance();
		// add -1 month to current month
		aCalendar.add(Calendar.MONTH, -1);
		// set DATE to 1, so first date of previous month
		aCalendar.set(Calendar.DATE, 1);

		Date firstDateOfPreviousMonth = aCalendar.getTime();
		System.out.println(firstDateOfPreviousMonth);

		// set actual maximum date of previous month
		aCalendar.set(Calendar.DATE,     aCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		//read it
		Date lastDateOfPreviousMonth = aCalendar.getTime();
		System.out.println(lastDateOfPreviousMonth);
		
		

		for (Entry e : getEntryList()) {
			if (e.getEntryDate().after(lastDateOfPreviousMonth)) {

				if (e.getEntryInfo().equals(CommonResources.TEXT_DEPOSIT)) {
					totalCredits = e.getAmount();
				}
				if (e.getEntryInfo().equals(CommonResources.TEXT_WITHDRAW)) {
					totalCharges = e.getAmount();
				}

			}

		}
		
		
		newBalance = previousBalance - totalCredits + totalCharges + MI
				* (previousBalance - totalCredits);
		
		totalDue = MP * newBalance;
		
		StringBuilder monthlybillBuilder = new StringBuilder();
		
		System.out.println("Current Balance is " + newBalance);
		System.out.println("Previous Balance for this month is "
				+ previousBalance);
		System.out.println("Total Charges for this month " + totalCharges);
		System.out.println("Total Payment for this month " + totalCredits);
		System.out.println("Total Due remaining " + totalDue);
		
		monthlybillBuilder.append("Current Balance is " + newBalance);
		monthlybillBuilder.append("Previous Balance for this month is "
				+ previousBalance);
		monthlybillBuilder.append("Total Charges for this month " + totalCharges);
		monthlybillBuilder.append("Total Payment for this month " + totalCredits);
		monthlybillBuilder.append("Total Due remaining " + totalDue);
		
		
		
		return monthlybillBuilder;

	}

	public static double getMI() {
		return MI;
	}

	public static void setMI(double mI) {
		MI = mI;
	}

	public static double getMP() {
		return MP;
	}

	public static void setMP(double mP) {
		MP = mP;
	}

}
