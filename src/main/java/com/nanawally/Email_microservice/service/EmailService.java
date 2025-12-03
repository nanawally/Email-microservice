package com.nanawally.Email_microservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final Logger log = LoggerFactory.getLogger(EmailService.class);

    private static final String ADMIN_EMAIL = "lisa.upperud@stud.sti.se";

    public void sendAdminNotification(String newUserUsername) {
        log.info("Sending email to admin: {}, new user registered for {}", ADMIN_EMAIL, newUserUsername);
    }
}
