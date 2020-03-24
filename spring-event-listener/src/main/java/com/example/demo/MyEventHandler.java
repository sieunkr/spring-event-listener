package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    public void update(MyEvent myEvent) {
        System.out.println(myEvent.getPrice());
    }
}