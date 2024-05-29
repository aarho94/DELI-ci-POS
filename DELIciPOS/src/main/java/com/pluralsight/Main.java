package com.pluralsight;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a new order
        Order order = new Order();
        System.out.println("Order created at: " + order.getDateAndTime());

        // Create bread types
        Bread whiteBread = new Bread("white");
        Bread wheatBread = new Bread("wheat");

        // Create sandwiches
        Sandwich sandwich1 = new Sandwich(whiteBread, 8, true);
        Sandwich sandwich2 = new Sandwich(wheatBread, 12, false);

        // Create toppings
        Topping lettuce = new RegularTopping("Lettuce");
        Topping tomato = new RegularTopping("Tomato");
        Topping chicken = new Meat("Chicken");
        Topping cheese = new Cheese("Cheddar");
        Topping mayo = new Sauce("Mayo");

        // Add toppings to sandwiches
        sandwich1.addTopping(lettuce);
        sandwich1.addTopping(tomato);
        sandwich1.addTopping(chicken);
        sandwich1.addTopping(mayo);

        sandwich2.addTopping(lettuce);
        sandwich2.addTopping(tomato);
        sandwich2.addTopping(cheese);
        sandwich2.addTopping(mayo);

        // Add sandwiches to the order
        order.addSandwich(sandwich1);
        order.addSandwich(sandwich2);

        // Create drinks
        Drink drink1 = new Drink("small", "Cola", 1.5);
        Drink drink2 = new Drink("large", "Lemonade", 2.5);

        // Add drinks to the order
        order.addDrink(drink1);
        order.addDrink(drink2);

        // Create chips
        Chips chips1 = new Chips("Classic", 1.0);
        Chips chips2 = new Chips("BBQ", 1.2);

        // Add chips to the order
        order.addChips(chips1);
        order.addChips(chips2);

        // Checkout the order
        order.checkout();
        System.out.println("Total cost after checkout: $" + order.getTotalCost());

        // Cancel the order
        order.cancelOrder();
        System.out.println("Order canceled. Total cost: $" + order.getTotalCost());
    }
}

