package com.pluralsight.models;

public class Bread {
    private String type;

    public Bread(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getPrice(int sandwichSize) {
        switch (sandwichSize) {
            case 4:
                return 5.50;
            case 8:
                return 7.00;
            case 12:
                return 8.50;
            default:
                return 0.0;
        }
    }
}


