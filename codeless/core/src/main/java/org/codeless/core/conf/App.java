package org.codeless.core.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"org.codeless.core"})
@EnableJpaRepositories(basePackages = {"org.codeless.core.repo"})
@EntityScan(basePackages={"org.codeless.core.domain"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
