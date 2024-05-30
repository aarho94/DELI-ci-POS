package com.pluralsight.models;

public class Cheese extends Topping {
    public Cheese(String name) {
        super(name);
    }

    @Override
    public double getPrice(int sandwichSize) {
        switch (sandwichSize) {
            case 4:
                return 0.75;
            case 8:
                return 1.50;
            case 12:
                return 2.25;
            default:
                return 0.0;
        }
    }
}


