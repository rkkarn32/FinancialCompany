package com.financial.utilities;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class CommonResources {

	public static String CUSTORMER_COMPANY            = "Company";
	public static String CUSTORMER_PERSON             = "Person";
	
	public static String ACCOUNT_DEFAULT_TYPE         = "DEFAULT";
	public static double ACCOUNT_DEFAULT_INTERESTRATE = 10.1;
	
	public static String TEXT_DEPOSIT = "Deposit";
	public static String TEXT_WITHDRAW = "Withdraw";
	public static String TEXT_INTERESTAMOUNT = "Interest added";
	
	
	public static String ACCOUNTFACTORY = "Account Factory";
	public static String TRANSACTIONFACTORY = "Transaction Factory";
	public static String CUTOMERFACTORY = "Customer Factory";
	
	
	
	public static String TRANSACTION_DEPOSITE = "Deposite";
	public static String TRANSACTION_wITHDRAW = "Withdraw";
	public static String TRANSACTION_ADDINTEREST = "AddInterest";
	
	
	public static String ACCOUNT = "Account";
	
	
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
	
	
	

	public static boolean startUp = false;
	public static Session session;

	public static Session createMalingInstance() {
		if (!startUp) {
			final String username = "group5.autogenerator.mail@gmail.com";
			final String password = "groupwork123#";
			Properties props = new Properties();

			props.put("mail.smtp.auth", "true");

			props.put("mail.smtp.starttls.enable", "true");

			props.put("mail.smtp.host", "smtp.gmail.com");

			props.put("mail.smtp.port", "587");
			Session ses = Session.getInstance(props,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username,
									password);
						}
					});
			session = ses;
			startUp = true;
		}
		return session;
	}

	public static boolean sendMail(String recipent, String messageToBeSent,
			String subject) {

		Session session = createMalingInstance();
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("admin@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipent));
			message.setSubject(subject);

			message.setText(messageToBeSent);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			return false;
		}
	}
}
