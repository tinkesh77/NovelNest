package com.novelapi.novelnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages = "com.novelapi.novelnest.entity")
@EnableWebMvc
public class NovelnestApplication {
    public static void main(String[] args) {
        SpringApplication.run(NovelnestApplication.class, args);
    }
}
