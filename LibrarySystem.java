import java.util.Scanner;

public class LibrarySystem {

    Scanner sc = new Scanner(System.in);

    int bookId, totalBook, avlBook;
    String bookName = "", bookAuthor = "", bookCat = "";
    boolean isBookAdd = false;

    // Search Book
    void searchBook() {

        int id;

        if (isBookAdd) {

            System.out.println("Enter Book ID:");
            id = sc.nextInt();

            if (bookId == id) {
                viewBook();
            } else {
                System.out.println("Invalid Book ID");
            }

        } else {
            System.out.println("Go and add Book first");
        }
    }

    // View Book
    void viewBook() {

        if (isBookAdd) {

            System.out.println("\n----- Your Book Details -----");

            System.out.println("Book ID      : " + bookId);
            System.out.println("Book Name    : " + bookName);
            System.out.println("Book Author  : " + bookAuthor);
            System.out.println("Book Category: " + bookCat);
            System.out.println("Total Books  : " + totalBook);
            System.out.println("Available    : " + avlBook);

        } else {
            System.out.println("Go and add Book first");
        }
    }

    // Add Book
    void addBook() {

        System.out.println("\n----- Add Book Details -----");

        System.out.println("Enter Your Book ID:");
        bookId = sc.nextInt();

        sc.nextLine(); // Clear buffer

        System.out.println("Enter Your Book Name:");
        bookName = sc.nextLine();

        System.out.println("Enter Your Book Author:");
        bookAuthor = sc.nextLine();

        System.out.println("Enter Your Book Category:");
        bookCat = sc.nextLine();

        System.out.println("Enter Total Copies:");
        totalBook = sc.nextInt();

        avlBook = totalBook;

        isBookAdd = true;

        System.out.println("Book Added Successfully!");
    }

    // Main Menu
    void mainMenu() {

        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Add Book");
        System.out.println("2. View Book");
        System.out.println("3. Search Book");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. Delete Book");
        System.out.println("7. Library Report");
        System.out.println("8. Exit");
    }

    // Main Method
    public static void main(String[] args) {

        LibrarySystem obj = new LibrarySystem();

        int choice;

        do {

            obj.mainMenu();

            System.out.println("Please Enter Your Choice:");
            choice = obj.sc.nextInt();

            switch (choice) {

                case 1:
                    obj.addBook();
                    break;

                case 2:
                    obj.viewBook();
                    break;

                case 3:
                    obj.searchBook();
                    break;

                case 4:
                    System.out.println("Issue Book feature coming soon...");
                    break;

                case 5:
                    System.out.println("Return Book feature coming soon...");
                    break;

                case 6:
                    System.out.println("Delete Book feature coming soon...");
                    break;

                case 7:
                    System.out.println("Library Report feature coming soon...");
                    break;

                case 8:
                    System.out.println("Thank you for using Library System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 8);

        obj.sc.close();
    }
}