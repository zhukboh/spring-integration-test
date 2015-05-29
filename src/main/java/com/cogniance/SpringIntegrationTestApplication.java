package com.cogniance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/integration.xml")
public class SpringIntegrationTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationTestApplication.class, args);
    }
}
