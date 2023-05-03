package com.capmu.sendingemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@SpringBootApplication
public class SendingEmailApplication {

//	@Bean
//	public JavaMailSender getJavaMailSender() {
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		mailSender.setHost("smtp.gmail.com");
//		mailSender.setPort(587);
//
//		mailSender.setUsername("<email-for-smtp>");
//		mailSender.setPassword("<password-for-smtp>"); //generated from https://myaccount.google.com/apppasswords
//
//		Properties props = mailSender.getJavaMailProperties();
//		props.put("mail.transport.protocol", "smtp");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.debug", "true");
//
//		return mailSender;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SendingEmailApplication.class, args);
	}

}
