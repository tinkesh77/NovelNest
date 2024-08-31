package com.admin.novelnestadmin.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.user.novelnestuser.repository")
@EntityScan(basePackages = "com.entity.novelnestentity")
public class AdminConfig {

}
