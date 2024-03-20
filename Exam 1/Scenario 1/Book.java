public class Book
{
    private int bookID;
    private String title;
    private boolean isAvailable;

    public Book(int bookID, String title)
    {
        this.bookID = bookID;
        this.title = title;
        this.isAvailable = true;
    }

    // Getters
    public int getBookID()
    {
        return bookID;
    }
    public String getTitle()
    {
        return title;
    }
    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void borrowBook()
    {
        if(isAvailable)
        {
            isAvailable = false;
            System.out.println("Book " + title + " with ID " + bookID + " has been borrowed!");
        }
        else
        {
            System.out.println("Sorry, the book " + title + " is currently not available.");
        }
    }

    public void returnBook()
    {
        isAvailable = true;
        System.out.println("Book " + title + " with ID " + bookID + " has been returned!");
    }
}
