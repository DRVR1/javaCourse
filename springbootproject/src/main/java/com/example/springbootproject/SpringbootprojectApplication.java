package com.example.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootprojectApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.code();
	}

}
