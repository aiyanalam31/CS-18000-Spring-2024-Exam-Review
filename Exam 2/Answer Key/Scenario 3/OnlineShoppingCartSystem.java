import java.util.*;
public class OnlineShoppingCartSystem {
    public static void main(String[] args) 
    {
        try
        {
            // Create some sample items for the store
            Electronics laptop = new Electronics("Laptop", 999.99, "Dell");
            Electronics smartphone = new Electronics("Smartphone", -499.99, "Samsung"); // Invalid price
            Clothing shirt = new Clothing("Shirt", 29.99, "Large", "Blue");

            // Initialize a shopping cart
            ShoppingCart cart = new ShoppingCart();

            // Add items to the cart
            cart.addItem(laptop);
            cart.addItem(smartphone); // This should throw an exception
            cart.addItem(shirt);

            // Display items in the cart
            System.out.println("Items in Cart:");
            for (Item item : cart.getItems()) {
                System.out.println("- " + item);
            }

            // Calculate and display total cost
            System.out.println("\nTotal Cost: $" + cart.calculateTotal()); 
        } catch (InvalidPriceException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}