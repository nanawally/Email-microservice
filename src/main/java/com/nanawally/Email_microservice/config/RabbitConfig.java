package com.nanawally.Email_microservice.config;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableRabbit
public class RabbitConfig {
    public static final String QUEUE_NAME = "email-queue";
}
