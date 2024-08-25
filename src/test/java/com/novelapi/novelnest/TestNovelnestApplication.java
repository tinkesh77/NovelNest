package com.novelapi.novelnest;

import org.springframework.boot.SpringApplication;

public class TestNovelnestApplication {

	public static void main(String[] args) {
		SpringApplication.from(NovelnestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
