import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library(3); // Capacity 3 books

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    Book b = new Book(id, title, author);
                    lib.addBook(b);
                    break;

                case 2:
                    // Display Books
                    lib.displayBooks();
                    break;

                case 3:
                    // Borrow Book
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    lib.borrowBook(borrowId);
                    break;

                case 4:
                    // Return Book
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    lib.returnBook(returnId);
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
