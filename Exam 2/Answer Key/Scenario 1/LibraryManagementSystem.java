import java.util.Scanner;
public class LibraryManagementSystem 
{
    public static final String MENU_TITLE = "\nLibrary Management System Menu:";
    public static final String MENU_ITEM_1 = "1. Add a book";
    public static final String MENU_ITEM_2 = "2. Display all books";
    public static final String MENU_ITEM_3 = "3. Search for a book";
    public static final String MENU_ITEM_4 = "4. Remove a book";
    public static final String MENU_ITEM_5 = "5. Exit";
    public static final String CHOICE_PROMPT = "Enter your choice: ";
    public static final String ADD_TITLE_PROMPT = "Enter book title: ";
    public static final String AUTHOR_PROMPT = "Enter author name: ";
    public static final String PUBLICATION_PROMPT = "Enter year of publication: ";
    public static final String TITLE_SEARCH_PROMPT = "Enter book title to search: ";
    public static final String REMOVE_TITLE_PROMPT = "Enter book title to remove: ";
    public static final String EXIT_PROMPT = "Exiting...";
    

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10); // Assuming library capacity of 10 books

        int choice;
        do
        {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for a book");
            System.out.println("4. Remove a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter year of publication: ");
                    int yearPublished = scanner.nextInt();
                    library.addBook(new Book(title, author, yearPublished));
                    break;
                case 2:
                    library.displayInventory();
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case 4:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.removeBook(removeTitle);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
    }
}

