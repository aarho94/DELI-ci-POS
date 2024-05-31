# DELI-ci-POS

<img width="1558" alt="Screenshot 2024-05-30 at 10 53 15 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/28ce6c5a-48e2-437b-a2cd-99f5ec20a45a">


**Step 1: Initial Planning and Setup**

- Set Up Your Development Environment:
    - Set up a version control system (e.g., Git) and create a repository.

- Gather Requirements and Analyze:
    - Carefully read through the application requirements.
    - Identify the core entities (nouns) and actions (verbs).

**Step 2: Create Class Diagram**

- Identify Classes and Interfaces:
    - Classes: Sandwich, Order, Bread, Topping, Meat, Cheese, Sauce, Drink, Chips, Receipt.
    - Interfaces: Customizable (for items that can have custom options like Sandwich).

- Draw Class Diagram (found above)

**Step 3: Define Classes and Interfaces**

- Create Class Definitions:
    - Define the classes in Java
    - Include attributes and methods based on the requirements.

- Implement Interfaces:
    - Ensure that relevant classes implement the Customizable interface.


**Step 4: Implement Core Functionality**

- Sandwich Customization:
    - Create methods to allow customization of sandwiches (select size, bread, toppings).

- Order Management:
    - Implement functionality to add sandwiches, drinks, and chips to an order.
    - Maintain an order list.

- Pricing Calculation:
    - Implement methods to calculate the total cost of the order, considering extra charges for         premium toppings.

**Step 5: Develop User Interface**

- Home Screen:
    - Create the initial screen with options for "New Order" and "Exit".

- Order Screen:
    - Develop the order screen with options to add sandwiches, drinks, chips, and checkout.

- Sandwich Customization Screen:
    - Step-by-step screens to select bread, size, toppings, etc.

- Checkout Screen:
    - Display order details and total cost.
    - Confirm and save the receipt.

**Step 6: Save Order Receipts**

- Generate Receipt File:
    - Implement functionality to save order details to a file named by date and time.
    - Ensure the file is saved in the receipts folder.

**Step 7: Testing and Debugging**

- Test Each Component:
    - Perform unit testing for each class and method.
    - Test the full order process from start to finish.

- Debug and Fix Issues:
    - Identify and fix any issues or bugs.

**Step 8: Finalize and Document**

- Update Class Diagram:
    - Ensure your class diagram reflects the final implementation.
