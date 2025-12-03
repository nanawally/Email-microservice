package com.nanawally.Email_microservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final Logger log = LoggerFactory.getLogger(EmailService.class);
    private final JavaMailSender mailSender;

    @Value("${SMTP_USERNAME}")
    private String adminEmail;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendAdminNotification(String newUserUsername) {
        log.info("Sending email to admin: {}, new user registered for {}", adminEmail, newUserUsername);

        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(adminEmail);
            message.setSubject("New user has been registered");
            message.setText("A new user has registered with username: " +  newUserUsername);

            mailSender.send(message);

            log.info("Email sent to {}", adminEmail);
        } catch (Exception e) {
            log.error("Error sending email to admin: {}", adminEmail, e);
        }
    }
}
