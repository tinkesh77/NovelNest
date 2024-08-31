    package com.admin.novelnestadmin;

    import com.user.novelnestuser.repository.UserRepository;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.boot.autoconfigure.domain.EntityScan;
    import org.springframework.context.annotation.Import;
    import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

    public class NovelNestAdminApplication {
        public static void main(String[] args) {
            SpringApplication.run(NovelNestAdminApplication.class, args);
        }
    }
