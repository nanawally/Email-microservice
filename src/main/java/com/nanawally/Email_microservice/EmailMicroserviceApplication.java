package com.nanawally.Email_microservice;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class EmailMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailMicroserviceApplication.class, args);
        System.out.println("EmailMicroserviceApplication started");
	}

}
