package com.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.authmodule.commons.model", "com.profile.data.entity"})
@ComponentScan(basePackages = {"com.authmodule.commons.service.impl", "com.profile.controller"})
@EnableJpaRepositories(basePackages = {"com.profile.data.repository", "com.authmodule.commons.repository"})
public class ProfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfileApplication.class, args);
    }

}
