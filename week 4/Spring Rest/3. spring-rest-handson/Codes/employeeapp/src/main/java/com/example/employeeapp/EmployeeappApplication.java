package com.example.employeeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employee.xml")
public class EmployeeappApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeappApplication.class, args);
	}
}
