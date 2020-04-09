package com.example.freshvotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("domain")
@SpringBootApplication
public class FreshvotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshvotesApplication.class, args);
	}

}
