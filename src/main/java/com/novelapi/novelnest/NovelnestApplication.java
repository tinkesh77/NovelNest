package com.novelapi.novelnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.novelapi.novelnest.models")
public class NovelnestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovelnestApplication.class, args);
	}
}
