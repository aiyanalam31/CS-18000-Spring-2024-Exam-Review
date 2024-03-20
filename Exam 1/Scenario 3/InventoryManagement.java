// import statements go here
import java.util.Scanner;

// JavaDoc goes here

/**
 * Scenario 3 -- The Store
 *
 * This program creates two products and allows a user to change how much stock each product has.
 *
 * @author Aiyan Alam
 *
 * @version February 17, 2024
 *
 */

public class InventoryManagement
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the store!");

        Product product1 = new Product(1, "eggs", 3.00, 20);
        Product product2 = new Product(2, "apples", 1.50, 30);

        // Displaying the products
        product1.displayProductInfo();
        product2.displayProductInfo();

        // Adding to Stock Quantity
        System.out.print("Enter the number of eggs that you want to add: ");
        int eggsAdded = input.nextInt();
        input.nextLine();
        System.out.print("\n");
        product1.updateStockQuantity(eggsAdded);

        System.out.print("Enter the number of apples that you want to add: ");
        int applesAdded = input.nextInt();
        input.nextLine();
        System.out.print("\n");
        product2.updateStockQuantity(applesAdded);

        // Updated Product Information
        System.out.println("Updated Product Information:");
        product1.displayProductInfo();
        product2.displayProductInfo();

    }


}
