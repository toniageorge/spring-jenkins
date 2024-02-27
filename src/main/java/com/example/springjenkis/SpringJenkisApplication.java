package com.example.springjenkis;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJenkisApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkisApplication.class);




	@PostConstruct
	public void intt(){
		logger.info("application started");

	}
	public static void main(String[] args) {
		logger.info("application executed");
		SpringApplication.run(SpringJenkisApplication.class, args);
	}

}
