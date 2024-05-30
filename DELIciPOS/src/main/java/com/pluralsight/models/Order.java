package com.pluralsight.models;

import com.pluralsight.interfaces.Orderable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order implements Orderable {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;
    private double totalCost;

    public Order() {
        sandwiches = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
        totalCost = 0.0;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chips) {
        this.chips.add(chips);
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    @Override
    public double calculateCost() {
        totalCost = 0.0;
        for (Sandwich sandwich : sandwiches) {
            totalCost += sandwich.calculateCost();
        }
        for (Drink drink : drinks) {
            totalCost += drink.calculateCost();
        }
        for (Chips chips : this.chips) {
            totalCost += chips.calculateCost();
        }
        return totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void saveReceipt() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String filename = "receipts/" + timestamp + ".csv";

        File dir = new File("receipts");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Item,Type,Size/Type,Price\n");

            for (Sandwich sandwich : sandwiches) {
                writer.write("Sandwich," + sandwich.getBread().getType() + "," + sandwich.getSize() + " inches," + String.valueOf(sandwich.calculateCost()) + "\n");

                for (Topping topping : sandwich.getToppings()) {
                    writer.write("Topping," + topping.getName() + "," + sandwich.getSize() + " inches," + String.valueOf(topping.getPrice(sandwich.getSize())) + "\n");
                }
            }

            for (Drink drink : drinks) {
                writer.write("Drink," + drink.getFlavor() + "," + drink.getSize() + "," + String.valueOf(drink.calculateCost()) + "\n");
            }

            for (Chips chips : this.chips) {
                writer.write("Chips," + chips.toString() + ",," + String.valueOf(chips.calculateCost()) + "\n");
            }

            writer.write("Total,,," + String.valueOf(totalCost) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cancelOrder() {
        sandwiches.clear();
        drinks.clear();
        chips.clear();
        totalCost = 0.0;
    }
}



