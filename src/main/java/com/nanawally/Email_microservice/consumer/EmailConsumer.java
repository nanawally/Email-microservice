package com.nanawally.Email_microservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /*@RabbitListener(queues = RabbitConfig.QUEUE_NAME)
    public void handleMessage(String message) {
        System.out.println("TESTING");
        log.info(message);
    }*/

}