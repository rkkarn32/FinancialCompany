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
	
	public static String ACCOUNT_TYPE_DEFAULT         = "Account";
	public static double ACCOUNT_DEFAULT_INTEREST_RATE = 10.1;
	
	public static String TEXT_DEPOSIT = "Deposite";
	public static String TEXT_WITHDRAW = "Withdraw";
	public static String TEXT_INTERESTAMOUNT = "AddInterest";
	
	
	public static String ACCOUNTFACTORY = "Account Factory";
	public static String TRANSACTIONFACTORY = "Transaction Factory";
	public static String CUTOMERFACTORY = "Customer Factory";

	//public static String ACCOUNT_TYPE_DEFAULT = "Account";

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
			System.out.println("sent mail :: ");
			return true;

		} catch (MessagingException e) {
			return false;
		}
	}
	
	public static String splitString(String text){
		System.out.println(text);
		return text.substring(0, 2);
	}
}
