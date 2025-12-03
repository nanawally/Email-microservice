package com.nanawally.Email_microservice.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tools.jackson.databind.ObjectMapper;

@Configuration
@EnableRabbit
public class RabbitConfig {

    public static final String QUEUE_NAME = "email-queue";

    /*public static final String EXCHANGE_NAME = "email.microservice.exchange";
    public static final String ROUTING_KEY = "email.microservice.routingkey";

    @Bean
    public Queue emailMicroserviceQueue() {
        return QueueBuilder.durable(QUEUE_NAME).build();
    }

    @Bean
    public DirectExchange emailMicroserviceExchange() {
        return ExchangeBuilder.directExchange(EXCHANGE_NAME).durable(true).build();
    }

    @Bean
    public Binding emailMicroserviceBinding(Queue emailMicroserviceQueue, DirectExchange emailMicroserviceExchange) {
        return BindingBuilder.bind(emailMicroserviceQueue).to(emailMicroserviceExchange).with(ROUTING_KEY);
    }

    @Bean
    public JacksonJsonMessageConverter jacksonJsonMessageConverter(ObjectMapper objectMapper) {
        return new JacksonJsonMessageConverter(objectMapper);
    }*/
}
