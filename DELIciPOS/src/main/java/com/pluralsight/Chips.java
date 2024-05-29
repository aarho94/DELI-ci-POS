package com.pluralsight;

class Chips implements Orderable {
    private String id;
    private String type;
    private double price;

    public Chips(String type, double price) {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculateCost() {
        return price;
    }
}
