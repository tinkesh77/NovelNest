package com.novelapi.novelnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {
        "com.novelapi.novelnest",
        "com.admin.novelnestadmin",
        "com.user.novelnestuser"
})
@EntityScan(basePackages = {
        "com.user.novelnestuser.entity",
        "com.admin.novelnestadmin.entity"
})
@EnableJpaRepositories(basePackages = {
        "com.user.novelnestuser.repository",
        "com.admin.novelnestadmin.repositories"
})
@EnableWebMvc
public class NovelnestApplication {
    public static void main(String[] args) {
        SpringApplication.run(NovelnestApplication.class, args);
    }
}
