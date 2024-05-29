package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product whiteBread = new Product("White Bread", 5.50, "White bread", 100);
        Product wheatBread = new Product("Wheat Bread", 5.50, "Wheat bread", 100);
        Product ryeBread = new Product("Rye Bread", 5.50, "Rye bread", 100);
        Product wrap = new Product("Wrap", 5.50, "Wrap", 100);

        Meat steak = new Meat("Steak", 1.00);
        Meat ham = new Meat("Ham", 1.00);
        Meat salami = new Meat("Salami", 1.00);
        Meat roastBeef = new Meat("Roast Beef", 1.00);
        Meat chicken = new Meat("Chicken", 1.00);
        Meat bacon = new Meat("Bacon", 1.00);

        Cheese americanCheese = new Cheese("American Cheese", 0.75);
        Cheese provoloneCheese = new Cheese("Provolone Cheese", 0.75);
        Cheese cheddarCheese = new Cheese("Cheddar Cheese", 0.75);
        Cheese swissCheese = new Cheese("Swiss Cheese", 0.75);

        RegularTopping lettuce = new RegularTopping("Lettuce");
        RegularTopping peppers = new RegularTopping("Peppers");
        RegularTopping tomatoes = new RegularTopping("Tomatoes");
        RegularTopping jalepenos = new RegularTopping("Jalepenos");
        RegularTopping cucumbers = new RegularTopping("Cucumbers");
        RegularTopping pickles = new RegularTopping("Pickles");
        RegularTopping guacamole = new RegularTopping("Guacamole");
        RegularTopping mushrooms = new RegularTopping("Mushrooms");

        RegularTopping mayo = new RegularTopping("Mayo");
        RegularTopping mustard = new RegularTopping("Mustard");
        RegularTopping ketchup = new RegularTopping("Ketchup");
        RegularTopping ranch = new RegularTopping("Ranch");
        RegularTopping thousandIslands = new RegularTopping("Thousand Islands");
        RegularTopping vinaigrette = new RegularTopping("Vinaigrette");

        Drink smallDrink = new Drink("Small Drink", 2.00, "Small drink", 100, "Small");
        Drink mediumDrink = new Drink("Medium Drink", 2.50, "Medium drink", 100, "Medium");
        Drink largeDrink = new Drink("Large Drink", 3.00, "Large drink", 100, "Large");

        // Create a customer
        Customer customer = new Customer("John Doe", "john.doe@example.com");

        // Place orders
        customer.placeOrder(whiteBread, 2);
        customer.placeOrder(steak, 1);
        customer.placeOrder(mediumDrink, 3);

        // View orders
        customer.viewOrders();
    }
}
