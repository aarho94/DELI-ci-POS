package com.pluralsight;

class Order {
    private String id;
    private Date dateAndTime;
    private double totalCost;
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        this.id = UUID.randomUUID().toString();
        this.dateAndTime = new Date();
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
        this.totalCost = 0.0;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public void checkout() {
        totalCost = 0.0;
        for (Sandwich sandwich : sandwiches) {
            totalCost += sandwich.calculateCost();
        }
        for (Drink drink : drinks) {
            totalCost += drink.getPrice();
        }
        for (Chips chip : chips) {
            totalCost += chip.getPrice();
        }
    }

    public void cancelOrder() {
        sandwiches.clear();
        drinks.clear();
        chips.clear();
        totalCost = 0.0;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }
}

