package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final ApplicationEventPublisher applicationEventPublisher;

    public DemoApplication(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        applicationEventPublisher.publishEvent(
                new OrderEvent(this, "latte", 1100)
        );
    }
}
