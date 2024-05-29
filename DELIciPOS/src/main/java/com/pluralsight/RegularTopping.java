package com.pluralsight;

class RegularTopping extends Topping {
    public RegularTopping(String name) {
        super(name, "regular");
    }

    @Override
    public double getPrice(int sandwichSize) {
        return 0.0;
    }
}
