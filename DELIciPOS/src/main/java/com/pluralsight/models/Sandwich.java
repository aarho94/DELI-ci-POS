package com.pluralsight.models;

import com.pluralsight.interfaces.Orderable;
import com.pluralsight.interfaces.Toppable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Sandwich implements Orderable, Toppable
{
    private String id;
    private Bread breadType;
    private int size; // 4, 8, or 12
    private List<Topping> toppings;
    private boolean isToasted;

    public Sandwich(Bread breadType, int size, boolean isToasted) {
        this.id = UUID.randomUUID().toString();
        this.breadType = breadType;
        this.size = size;
        this.toppings = new ArrayList<>();
        this.isToasted = isToasted;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void removeTopping(Topping topping) {
        toppings.remove(topping);
    }

    public double calculateCost() {
        double cost = breadType.getPrice(size);
        for (Topping topping : toppings) {
            cost += topping.getPrice(size);
        }
        return cost;
    }
}