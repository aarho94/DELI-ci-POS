package com.pluralsight;

class Meat extends Topping {
    public Meat(String name) {
        super(name, "premium");
    }

    @Override
    public double getPrice(int sandwichSize) {
        switch (sandwichSize) {
            case 4:
                return 1.5;
            case 8:
                return 2.5;
            case 12:
                return 3.5;
            default:
                return 0.0;
        }
    }
}

