package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            Order order = new Order(this, product, quantity);
            product.updateStock(-quantity);
            orders.add(order);
        } else {
            System.out.println("Error: Not enough stock");
        }
    }

    public void viewOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

