package com.example.demo;

public class OrderEvent {

    private String name;
    private int price;

    public OrderEvent(String name, int price) {
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
