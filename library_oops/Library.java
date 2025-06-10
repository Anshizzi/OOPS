// Library.java
public class Library {
    Book[] books;    // Array of Book objects
    int sizeOfLib;   // Number of books added

    // Constructor
    public Library(int capacity) {
        books = new Book[capacity];
        sizeOfLib = 0;
    }

    //borrowing a book from lib
    public void borrowBook(int bookID){
        for(int i = 0; i < sizeOfLib; i++){
            if(books[i].bookID == bookID){
                if (!books[i].isBorrowed) {
                    books[i].isBorrowed = true;
                    System.out.println("Book borrowed successfully!");
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("no such book found");
    }

    //returning a book to the lib
    public void returnBook(int bookID){
        for(int i = 0; i < sizeOfLib; i++){
            if(books[i].bookID == bookID){
                if(books[i].isBorrowed == true){
                    books[i].isBorrowed = false;
                    System.out.println("Book is successfully returned");
                }
                else{
                    System.out.println("book is not borrowed");
                }
                return;
            }
        }
        System.out.println("Invalid input");
    }
    // Method to add a Book
    public void addBook(Book b) {
        if(sizeOfLib < books.length){
            books[sizeOfLib] = b;
            sizeOfLib++;
        } else {
            System.out.println("Library is full");
        }
    }

    // Method to display all Books
    public void displayBooks() {
        if(sizeOfLib == 0) {
            System.out.println("No books in the library.");
        } else {
            for(int i = 0; i < sizeOfLib; i++) {
                books[i].displayInfo();
            }
        }
    }
}
