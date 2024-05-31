# DELI-ci-POS

<img width="1198" alt="Screenshot 2024-05-31 at 1 47 59 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/b88f5ac9-d56e-4fcd-b933-e899a7b836b5">
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
 

**HOME SCREEN**

<img width="175" alt="Screenshot 2024-05-30 at 11 15 44 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/bdbdf136-74ae-4c39-9cae-9f718bff4913">


**ORDER SCREEN**

<img width="167" alt="Screenshot 2024-05-30 at 11 17 25 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/6dc839c2-56f2-46e7-9e5d-2e2c92cf1b43">


**CHOOSE SANDWICH SCREEN**

<img width="190" alt="Screenshot 2024-05-30 at 11 18 02 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/d54c1a99-5700-41a3-b03e-8de4994c91e3">


**ORDER SUMMARY**

<img width="687" alt="Screenshot 2024-05-30 at 11 20 28 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/35b77c9f-ec34-4eb9-9429-44cf4b78bdb4">


**CHECKOUT CONFIRMATION**

<img width="677" alt="Screenshot 2024-05-30 at 11 21 28 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/fe552049-0394-47ee-a572-26f3f1e37cae">

**TIME-STAMPED RECEIPT**

<img width="241" alt="Screenshot 2024-05-30 at 11 23 34 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/bc62e2e5-c42b-47ed-b89a-4dcf6428e06a">

A piece of code I found a lot of fun to implement was in the saveReceipt method in the Order class. This operation creates a "receipts" directory if it does not already exist to save a receipt to: 

<img width="348" alt="Screenshot 2024-05-30 at 11 33 54 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/86cfb867-5b45-4a74-807e-df472ff3c54e">

Additionally, in doing the bonus element of the project to create a shortcut for BLT and Philly Cheese Steak, it took me a while to figure out that extending from an abstract class for Signature Sandwiches (which extends Sandwich) would be a great way to do this, so figuring that out, was very satisfying. 

<img width="615" alt="Screenshot 2024-05-30 at 11 41 06 PM" src="https://github.com/aarho94/DELI-ci-POS/assets/166449365/c797ed80-1d68-4d5d-957c-8985fb6121a6">
