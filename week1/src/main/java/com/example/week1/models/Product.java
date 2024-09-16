package com.example.week1.models;

public class Product {
    private String name;
    private String factory;
    private int price;
    public Product(String name, String factory, int price) {
        this.name = name;
        this.factory = factory;
        this.price = price;

    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}