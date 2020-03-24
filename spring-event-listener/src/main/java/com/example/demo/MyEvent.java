package com.example.demo;

public class MyEvent {

    private int price;

    public MyEvent(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}