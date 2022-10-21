package com.marcondes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.marcondes.model.entities"})
@EnableJpaRepositories(basePackages = {"com.marcondes.repositories"})
@ComponentScan(basePackages = {"com.marcondes.controller", "com.marcondes.service", "com.marcondes.security"})

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	

}
