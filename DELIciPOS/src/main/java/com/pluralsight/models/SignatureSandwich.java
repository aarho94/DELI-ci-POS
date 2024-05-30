package com.pluralsight.models;

public abstract class SignatureSandwich extends Sandwich {
    public SignatureSandwich(Bread bread, int size, boolean isToasted) {
        super(bread, size, isToasted);
        addDefaultToppings();
    }

    protected abstract void addDefaultToppings();
}

