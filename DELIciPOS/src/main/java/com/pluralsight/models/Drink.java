package com.pluralsight.models;

import com.pluralsight.interfaces.Orderable;

import java.util.UUID;

public class Drink implements Orderable
{
    private String id;
    private String size; // small, medium, large
    private String flavor;
    private double price;

    public Drink(String size, String flavor, double price) {
        this.id = UUID.randomUUID().toString();
        this.size = size;
        this.flavor = flavor;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculateCost() {
        return price;
    }
}
