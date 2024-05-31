package com.pluralsight.models;

import com.pluralsight.models.interfaces.Orderable;

public class Drink implements Orderable {
    private String size;
    private String flavor;
    private double price;

    public Drink(String size, String flavor, double price) {
        this.size = size;
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public double calculateCost() {
        return price;
    }

    @Override
    public String toString() {
        return size + " " + flavor + " Drink";
    }

    public char getFlavor() {
        return flavor.charAt(0); // return the first character of the flavor string
    }

    public char getSize() {
        return size.charAt(0); // return the first character of the size string
    }
}