package com.pluralsight.models;

import com.pluralsight.models.interfaces.Orderable;

public class Chips implements Orderable
{
    private String type;
    private double price;

    public Chips(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public double calculateCost() {
        return price;
    }

    @Override
    public String toString() {
        return type + " Chips";
    }
}

