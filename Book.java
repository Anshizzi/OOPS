public class Book {
    int bookID;
    String title;
    String author;
    boolean isBorrowed;

    // Constructor
    public Book(int bookID, String title, String author){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Method to display a single book's details
    public void displayInfo() {
        System.out.println("ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed);
    }
}
