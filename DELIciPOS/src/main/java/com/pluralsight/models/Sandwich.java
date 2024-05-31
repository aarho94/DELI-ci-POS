package com.pluralsight.models;

import com.pluralsight.models.interfaces.Orderable;
import com.pluralsight.models.interfaces.Toppable;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Orderable, Toppable {
    private Bread bread;
    private int size;
    private boolean isToasted;
    private List<Topping> toppings;

    public Sandwich(Bread bread, int size, boolean isToasted) {
        this.bread = bread;
        this.size = size;
        this.isToasted = isToasted;
        this.toppings = new ArrayList<>();
    }

    @Override
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public void removeTopping(Topping topping) {
        toppings.remove(topping);
    }

    @Override
    public double calculateCost() {
        double cost = bread.getPrice(size);
        for (Topping topping : toppings) {
            cost += topping.getPrice(size);
        }
        return cost;
    }

    public Bread getBread() {
        return bread;
    }

    public int getSize() {
        return size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append("\" ").append(bread.getType()).append(" Sandwich");
        if (isToasted) {
            sb.append(" (Toasted)");
        }
        sb.append(" with toppings: ");
        for (Topping topping : toppings) {
            sb.append(topping.getName()).append(", ");
        }
        return sb.toString();
    }
}


