package com.admin.novelnestadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.admin.novelnestadmin.entity")
public class NovelNestAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(NovelNestAdminApplication.class, args);
    }
}
