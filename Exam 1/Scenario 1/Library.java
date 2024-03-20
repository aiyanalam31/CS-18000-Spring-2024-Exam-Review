// JavaDoc goes here
/**
 * Scenario 1 -- The Library
 *
 * This program creates three books using Book.java, then the methods are tested to see how they work.
 *
 * @author Aiyan Alam
 *
 * @version February 17, 2024
 *
 */

public class Library {
    public static void main(String[] args)
    {
        // Creating the books
        Book book1 = new Book(1, "Harry Potter");
        Book book2 = new Book(2, "The Hunger Games");
        Book book3 = new Book(3, "Goosebumps");

        // Trying each getter method
        System.out.println(book1.getTitle());
        System.out.println(book1.getBookID());
        System.out.print("\n");

        System.out.println(book2.getTitle());
        System.out.println(book2.getBookID());
        System.out.print("\n");

        System.out.println(book3.getTitle());
        System.out.println(book3.getBookID());
        System.out.print("\n");

        // Borrowing books
        book1.borrowBook();
        book2.borrowBook();
        book3.borrowBook();

        // Borrowing books again
        book1.borrowBook();
        book2.borrowBook();
        book3.borrowBook();

        // Return books
        book1.returnBook();
        book2.returnBook();
        book3.returnBook();




    }
}
