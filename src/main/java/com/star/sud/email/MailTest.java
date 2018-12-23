package com.star.sud.email;
/*
 * @Author Sudarshan
 * */

public class MailTest {

	public static void main(String[] args) {
		// change accordingly
		String from = "sudarshan@gmail.com";
		String password = "******";
		String to = "sudarshan@gmail.com,sudarshan@gmail.com";
		String cc = "sudarshan@gmail.com,sudarshan@gmail.com";
		String subject = "Email from Java";
		String message = "Email code Testing!!!";
		String attchment = "C://Users/Sudarshan/Desktop/readMe.txt,C://Users/Sudarshan/Desktop/welcome.txt";

		String successMessage = "";

		successMessage = EmailConfiguration.sendMail(from, password, to, subject, message);
		System.out.println(successMessage);

		successMessage = EmailConfiguration.sendMailWithCC(from, password, to, cc, subject, message);
		System.out.println(successMessage);

		successMessage = EmailConfiguration.sendMailWithAttachment(from, password, to, cc, subject, message, attchment);
		System.out.println(successMessage);
	}

}
