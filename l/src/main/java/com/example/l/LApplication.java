package com.example.l;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.l.repository")
public class LApplication {

    public static void main(String[] args) {
        SpringApplication.run(LApplication.class, args);
    }

}
