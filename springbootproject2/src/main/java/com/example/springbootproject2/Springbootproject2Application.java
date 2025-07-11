package com.example.springbootproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootproject2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springbootproject2Application.class, args);

		Student student = context.getBean(Student.class);
		student.setId(1);
		student.setAvg(100);
		student.setName("ian");

		System.out.println("Average: " + student.getAvg());
	}

}
