package com.facu.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApirestApplication.class, args);

		System.out.println("En Efecto, Anda la fake API");

	}

}
