package com.novelapi.novelnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

;
@EntityScan(basePackages = "com.entity.novelnestentity")
@EnableJpaRepositories(basePackages = {"com.admin.novelnestadmin.repositories", "com.user.novelnestuser.repository"})
@EnableWebMvc
@SpringBootApplication(scanBasePackages = {"com.novelapi.novelnest", "com.admin.novelnestadmin" , "com.user.novelnestuser"})
public class NovelnestApplication {
    public static void main(String[] args) {
        SpringApplication.run(NovelnestApplication.class, args);
    }
}
