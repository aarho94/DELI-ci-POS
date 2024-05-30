package com.pluralsight.ui;

import com.pluralsight.application.Order;
import com.pluralsight.models.*;

import java.util.Scanner;

public class UserInterface {
    private Order order;
    private Scanner scanner;

    public UserInterface() {
        order = new Order();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Home Screen");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    newOrder();
                    break;
                case 0:
                    System.out.println("Exiting application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void newOrder() {
        order = new Order();
        while (true) {
            System.out.println("Order Screen");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkout();
                    return;
                case 0:
                    cancelOrder();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addSandwich() {
        System.out.println("Choose Sandwich Type:");
        System.out.println("1) Custom Sandwich");
        System.out.println("2) BLT");
        System.out.println("3) Philly Cheese Steak");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Sandwich sandwich;
        switch (choice) {
            case 1:
                sandwich = createCustomSandwich();
                break;
            case 2:
                sandwich = new BLT();
                customizeSandwich(sandwich);
                break;
            case 3:
                sandwich = new PhillyCheeseSteak();
                customizeSandwich(sandwich);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        order.addSandwich(sandwich);
        updateOrderSummary();
    }

    private Sandwich createCustomSandwich() {
        System.out.print("Enter bread type (white, wheat, rye, wrap): ");
        String breadType = scanner.nextLine();
        Bread bread = new Bread(breadType);

        System.out.print("Enter sandwich size (4, 8, 12): ");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Do you want it toasted? (yes/no): ");
        boolean isToasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(bread, size, isToasted);
        customizeSandwich(sandwich);
        return sandwich;
    }

    private void customizeSandwich(Sandwich sandwich) {
        while (true) {
            System.out.print("Enter topping type (meat, cheese, regular, sauce) or 'done' to finish: ");
            String toppingType = scanner.nextLine();
            if (toppingType.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter topping name: ");
            String toppingName = scanner.nextLine();
            Topping topping;
            switch (toppingType.toLowerCase()) {
                case "meat":
                    topping = new Meat(toppingName);
                    break;
                case "cheese":
                    topping = new Cheese(toppingName);
                    break;
                case "regular":
                    topping = new RegularTopping(toppingName);
                    break;
                case "sauce":
                    topping = new Sauce(toppingName);
                    break;
                default:
                    System.out.println("Invalid topping type.");
                    continue;
            }
            sandwich.addTopping(topping);
        }
    }

    private void addDrink() {
        System.out.print("Enter drink size (small, medium, large): ");
        String size = scanner.nextLine();

        System.out.print("Enter drink flavor: ");
        String flavor = scanner.nextLine();

        double price;
        switch (size.toLowerCase()) {
            case "small":
                price = 2.00;
                break;
            case "medium":
                price = 2.50;
                break;
            case "large":
                price = 3.00;
                break;
            default:
                System.out.println("Invalid size.");
                return;
        }

        Drink drink = new Drink(size, flavor, price);
        order.addDrink(drink);
        updateOrderSummary();
    }

    private void addChips() {
        System.out.print("Enter chips type: ");
        String type = scanner.nextLine();
        double price = 1.50;
        Chips chips = new Chips(type, price);
        order.addChips(chips);
        updateOrderSummary();
    }

    private void checkout() {
        order.calculateCost();
        System.out.println("Order Summary:");
        System.out.println("Sandwiches:");
        for (Sandwich sandwich : order.getSandwiches()) {
            System.out.println(" - " + sandwich);
        }
        System.out.println("Drinks:");
        for (Drink drink : order.getDrinks()) {
            System.out.println(" - " + drink);
        }
        System.out.println("Chips:");
        for (Chips chips : order.getChips()) {
            System.out.println(" - " + chips);
        }
        System.out.print("Total cost: $" + order.getTotalCost() + "\nDo you want to confirm the order? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            order.saveReceipt();
            System.out.println("Order confirmed and receipt saved.");
        } else {
            System.out.println("Order not confirmed.");
        }
    }

    private void cancelOrder() {
        order.cancelOrder();
        updateOrderSummary();
        System.out.println("Order canceled.");
    }

    private void updateOrderSummary() {
        System.out.println("Order Summary:");
        System.out.println("Sandwiches:");
        for (Sandwich sandwich : order.getSandwiches()) {
            System.out.println(" - " + sandwich);
        }
        System.out.println("Drinks:");
        for (Drink drink : order.getDrinks()) {
            System.out.println(" - " + drink);
        }
        System.out.println("Chips:");
        for (Chips chips : order.getChips()) {
            System.out.println(" - " + chips);
        }
        System.out.println("Total cost: $" + order.getTotalCost());
    }
}

