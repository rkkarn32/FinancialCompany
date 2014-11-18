package com.financial.utilities;

public class CommonResources {

	public static String CUSTORMER_COMPANY            = "Company";
	public static String CUSTORMER_PERSON             = "Person";
	
	public static String ACCOUNT_DEFAULT_TYPE         = "DEFAULT";
	public static double ACCOUNT_DEFAULT_INTERESTRATE = 10.1;
	
	public static String TRANSACTION_DEPOSIT          = "Deposit";
	public static String TRANSACTION_WITHDRAW         = "Withdraw";
	public static String TRANSACTION_INTERESTAMOUNT   = "Interest added";

	

	public static enum FACTORY {
		CUSTOMER_FACTORY, ACCOUNT_FACTORY, TRANSACTION_FACTORY
	}
	
	
	public static enum TRANSACTION{
		DEPOSITE, WITHDRAW, ADDINTEREST
	}
	
	public static enum CUSTOMER{
		PERSON, COMPANY
	}
	
	public enum ACCOUNT{
		ACCOUNT
	}
	

}
