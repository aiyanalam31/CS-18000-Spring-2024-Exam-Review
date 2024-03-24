public class Library {
    private Book[] books;
    private int numBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayInventory() {
        if (numBooks == 0) {
            System.out.println("Library inventory is empty.");
            return;
        }
        System.out.println("Current Inventory:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the inventory.");
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i] != null && books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book removed: " + books[i]);
                // Shift remaining books to fill the gap
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[numBooks - 1] = null;
                numBooks--;
                return;
            }
        }
        System.out.println("Book not found in the inventory.");
    }
}