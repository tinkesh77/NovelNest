package com.novelapi.novelnest.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.user.novelnestuser.repository")
public class JpaConfig {
}
