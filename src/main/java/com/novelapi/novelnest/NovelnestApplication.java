package com.novelapi.novelnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EntityScan(basePackages = "com.novelapi.novelnest.entity")
@EnableJpaRepositories(basePackages = "com.admin.novelnestadmin.repositories")
@EnableWebMvc
@SpringBootApplication(scanBasePackages = {"com.novelapi.novelnest", "com.admin.novelnestadmin"})
public class NovelnestApplication {
    public static void main(String[] args) {
        SpringApplication.run(NovelnestApplication.class, args);
    }
}
