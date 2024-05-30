package com.pluralsight.models;

public class BLT extends SignatureSandwich {
    public BLT() {
        super(new Bread("white"), 8, true);
    }

    @Override
    protected void addDefaultToppings() {
        addTopping(new Meat("Bacon"));
        addTopping(new Cheese("Cheddar"));
        addTopping(new RegularTopping("Lettuce"));
        addTopping(new RegularTopping("Tomato"));
        addTopping(new Sauce("Ranch"));
    }
}

