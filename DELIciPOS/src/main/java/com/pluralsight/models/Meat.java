package com.pluralsight.models;

public class Meat extends Topping {
    public Meat(String name) {
        super(name);
    }

    @Override
    public double getPrice(int sandwichSize) {
        switch (sandwichSize) {
            case 4:
                return 1.00;
            case 8:
                return 2.00;
            case 12:
                return 3.00;
            default:
                return 0.0;
        }
    }
}



