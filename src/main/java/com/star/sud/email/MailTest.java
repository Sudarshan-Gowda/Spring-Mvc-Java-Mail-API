package com.star.sud.email;
/*
 * @Author Sudarshan
 * */

public class MailTest {

	public static void main(String[] args) {
		// change accordingly 
		String from = "sudarsha@gmail.com";
		String password = "*****";
		String to = "sudarsha@gmail.com,sudarsha@gmail.com";
		String cc = "sudarsha@gmail.com,sudarsha@gmail.com";
		String subject = "Email from Java";
		String message = "Email code checking!!!";
		String attchment = "D://mail-test/technology-list.txt,D://mail-test/business-list.txt";

		String successMessage = "";

		successMessage = EmailConfiguration.sendMail(from, password, to, subject, message);
		System.out.println(successMessage);

		successMessage = EmailConfiguration.sendMailWithCC(from, password, to, cc, subject, message);
		System.out.println(successMessage);

		successMessage = EmailConfiguration.sendMailWithAttachment(from, password, to, cc, subject, message, attchment);
		System.out.println(successMessage);

	}
}
