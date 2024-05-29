package com.pluralsight.models;

public class Cheese extends Topping {
    public Cheese(String name) {
        super(name, "premium");
    }

    @Override
    public double getPrice(int sandwichSize) {
        switch (sandwichSize) {
            case 4:
                return 1.0;
            case 8:
                return 1.5;
            case 12:
                return 2.0;
            default:
                return 0.0;
        }
    }
}
