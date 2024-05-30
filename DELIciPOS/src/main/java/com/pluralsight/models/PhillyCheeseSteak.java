package com.pluralsight.models;

public class PhillyCheeseSteak extends SignatureSandwich {
    public PhillyCheeseSteak() {
        super(new Bread("white"), 8, true);
    }

    @Override
    protected void addDefaultToppings() {
        addTopping(new Meat("Steak"));
        addTopping(new Cheese("American"));
        addTopping(new RegularTopping("Peppers"));
        addTopping(new Sauce("Mayo"));
    }
}

