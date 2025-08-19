package com.example.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.microservice1.feing")
public class Microservice1Application {
	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}
}
