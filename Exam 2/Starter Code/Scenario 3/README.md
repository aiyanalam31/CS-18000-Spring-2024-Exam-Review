# Instructions for Coding the Online Shopping Cart System:

1. Define Item Classes: Start by defining the necessary classes for items in the store. You'll need a superclass Item, and optionally, subclasses such as Electronics and Clothing if you want to categorize items.

2. Implement Item Features: Implement the necessary features for items, such as name, price, and any specific details depending on the item type. Ensure proper encapsulation by providing appropriate access modifiers for fields and methods.

3. Introduce Interface (Optional): If you choose to provide discounts on certain items, introduce an interface Discountable with a method to apply discounts. Implement this interface in relevant item classes.

4. Handle Invalid Prices with Exception: Implement a custom exception class InvalidPriceException to handle scenarios where an item's price is negative or zero. Throw this exception when an invalid price is encountered during item creation.

5. Develop Shopping Cart: Define a ShoppingCart class to manage the items in the user's cart. Implement methods to add items to the cart, remove items from the cart, and calculate the total cost of the items in the cart.

6. Test Your Implementation: Write a main method to test your implementation. Create sample items, add them to the shopping cart, and perform operations such as adding, removing items, and calculating the total cost. Ensure that your code properly handles exceptions if invalid prices are encountered.

# Instructions for Implementing Exception Handling:

1. Identify Potential Exception Scenarios: Identify scenarios in your code where exceptions might occur. In this case, it's when an item with an invalid price (negative or zero) is created.

2. Throw Custom Exception: Implement a custom exception class (InvalidPriceException) to handle the identified scenario. Throw this exception when the condition for an invalid price is met.

3. Handle Exceptions with Try-Catch Blocks: Surround the code where the exception might occur with a try block. Immediately after the try block, add a catch block to catch the custom exception (InvalidPriceException). In the catch block, handle the exception appropriately, such as printing an error message.

4. Test Exception Handling: Test your code by deliberately causing the exception scenario to occur (e.g., by attempting to create an item with an invalid price). Verify that the exception is caught and handled as expected.

By following these instructions, students should be able to implement the Online Shopping Cart System while incorporating exception handling for invalid prices effectively.