package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class OrderEvent extends ApplicationEvent {

    private String name;
    private int price;

    public OrderEvent(Object source, String name, int price) {
        super(source);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
