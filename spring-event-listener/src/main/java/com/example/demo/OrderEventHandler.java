package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventHandler {

    private final MessageService messageService;

    public OrderEventHandler(MessageService messageService) {
        this.messageService = messageService;
    }

    @EventListener
    public void update(OrderEvent event) {
        messageService.send("name:" + event.getName() + ", price:" + event.getPrice());
    }
}