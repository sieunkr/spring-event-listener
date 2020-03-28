package com.example.demo;

import org.springframework.boot.context.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SpringEventHandler {

    @EventListener
    public void handle(ApplicationStartedEvent event) {
        System.out.println("log:ApplicationStartedEvent");
    }
    
    @EventListener
    public void handle(ApplicationReadyEvent event) {
        System.out.println("log:ApplicationReadyEvent");
    }

    /*
    @EventListener
    public void handle(ApplicationContextInitializedEvent event) {
        System.out.println("ApplicationContextInitializedEvent");
    }

    @EventListener
    public void handle(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("ApplicationEnvironmentPreparedEvent");
    }

    @EventListener
    public void handle(ApplicationPreparedEvent event) {
        System.out.println("ApplicationPreparedEvent");
    }

    @EventListener
    public void handle(ApplicationFailedEvent event) {
        System.out.println("ApplicationFailedEvent");
    }

    @EventListener
    public void handle(ApplicationStartingEvent event) {
        System.out.println("ApplicationStartingEvent");
    }
    */
}
