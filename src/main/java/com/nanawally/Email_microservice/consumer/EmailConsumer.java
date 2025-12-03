package com.nanawally.Email_microservice.consumer;

import com.nanawally.Email_microservice.config.RabbitConfig;
import com.nanawally.Email_microservice.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final EmailService emailService;

    @Autowired
    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = RabbitConfig.QUEUE_NAME)
    public void handleMessage(String message) {
        log.info("Received message from queue: {}", message);

        String username = message.replace("New user registered: ", "");

        emailService.sendAdminNotification(username);
    }
}