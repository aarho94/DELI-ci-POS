package com.pluralsight;

abstract class Topping {
    private String name;
    private String type;

    public Topping(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public abstract double getPrice(int sandwichSize);
}
