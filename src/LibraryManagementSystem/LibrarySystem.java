package LibraryManagementSystem;

import java.sql.*;
import java.util.*;

public class LibrarySystem {

    private static final String url = "jdbc:mysql://localhost:3306/LibraryManagementSystem";
    private static final String user = "root";
    private static final String password = "pop99558$$";

    private static Scanner scanner;
    private static BookDAO bookDAO;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection(url, user, password);
        bookDAO = new BookDAO(connection);

        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║   LIBRARY MANAGEMENT SYSTEM - JDBC CRUD APP    ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        while (true) {
            System.out.println("\n┌────────────────────────────────────────────────┐");
            System.out.println("│              MAIN MENU                         │");
            System.out.println("├────────────────────────────────────────────────┤");
            System.out.println("│  1. Add New Book                               │");
            System.out.println("│  2. View All Books                             │");
            System.out.println("│  3. View Book by ID                            │");
            System.out.println("│  4. Search Books (by Title/Author)             │");
            System.out.println("│  5. Update Book                                │");
            System.out.println("│  6. Delete Book                                │");
            System.out.println("│  7. View Inventory Value                       │");
            System.out.println("│  8. Exit                                       │");
            System.out.println("└────────────────────────────────────────────────┘");

            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1 -> addNewBook();
                case 2 -> viewAllBooks();
                case 3 -> viewBookById();
                case 4 -> searchBooks();
                case 5 -> updateBook();
                case 6 -> deleteBook();
                case 7 -> viewInventoryValue();
                case 8 -> {
                    System.out.println("Thank you for using Library Management System.");
                    System.exit(0);
                }
                default -> System.out.println("✗ Invalid choice. Please try again.");
            }
        }
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("✗ Invalid input! Please enter a valid number.");
            }
        }
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static String getStringInputOptional(String prompt, String defaultValue) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : input;
    }

    private static int getIntInputOptional(String prompt, int defaultValue) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) return defaultValue;
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("✗ Invalid input! Using default value.");
            return defaultValue;
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("✗ Invalid input! Please enter a valid number.");
            }
        }
    }

    private static double getDoubleInputOptional(String prompt, double defaultValue) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) return defaultValue;
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("✗ Invalid input! Using default value.");
            return defaultValue;
        }
    }

    private static void addNewBook() throws SQLException, ClassNotFoundException {
        System.out.println("\n══════ ADD NEW BOOK ══════");

        String isbn = getStringInput("Enter ISBN: ");
        String title = getStringInput("Enter Title: ");
        String author = getStringInput("Enter Author: ");
        String publisher = getStringInput("Enter Publisher: ");
        int year = getIntInput("Enter Year Published: ");
        int quantity = getIntInput("Enter Quantity: ");
        double price = getDoubleInput("Enter Price: $");

        Book book = new Book(isbn, title, author, publisher, year, quantity, price);
        if (bookDAO.addBook(book)) {
            System.out.println("\n✓ Book added successfully!");
        } else {
            System.out.println("\n✗ Failed to add book.");
        }
    }

    private static void viewAllBooks() throws SQLException {
        System.out.println("\n══════ ALL BOOKS ══════");
        List<Book> books = bookDAO.getAllBooks();

        if (books.isEmpty()) {
            System.out.println("No books found in the library.");
        } else {
            System.out.println("Total books: " + books.size());
            for (Book book : books) System.out.println(book);
        }
    }

    private static void viewBookById() throws SQLException {
        int id = getIntInput("Enter Book ID: ");
        Book book = bookDAO.getBookById(id);
        if (book != null) System.out.println(book);
        else System.out.println("✗ Book not found with ID: " + id);
    }

    private static void searchBooks() throws SQLException {
        String keyword = getStringInput("Enter search keyword (title/author): ");
        List<Book> books = bookDAO.searchBooks(keyword);
        if (books.isEmpty()) System.out.println("✗ No books found.");
        else books.forEach(System.out::println);
    }

    private static void updateBook() throws SQLException, ClassNotFoundException {
        int id = getIntInput("Enter Book ID to update: ");
        Book book = bookDAO.getBookById(id);
        if (book == null) {
            System.out.println("✗ Book not found.");
            return;
        }

        String isbn = getStringInputOptional("ISBN [" + book.getIsbn() + "]: ", book.getIsbn());
        String title = getStringInputOptional("Title [" + book.getTitle() + "]: ", book.getTitle());
        String author = getStringInputOptional("Author [" + book.getAuthor() + "]: ", book.getAuthor());
        String publisher = getStringInputOptional("Publisher [" + book.getPublisher() + "]: ", book.getPublisher());
        int year = getIntInputOptional("Year [" + book.getYearPublished() + "]: ", book.getYearPublished());
        int quantity = getIntInputOptional("Quantity [" + book.getQuantity() + "]: ", book.getQuantity());
        double price = getDoubleInputOptional("Price [" + book.getPrice() + "]: ", book.getPrice());

        book.setIsbn(isbn);
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setYearPublished(year);
        book.setQuantity(quantity);
        book.setPrice(price);

        if (bookDAO.updateBook(book))
            System.out.println("✓ Book updated successfully!");
        else
            System.out.println("✗ Failed to update book.");
    }

    private static void deleteBook() throws SQLException, ClassNotFoundException {
        int id = getIntInput("Enter Book ID to delete: ");
        Book book = bookDAO.getBookById(id);
        if (book == null) {
            System.out.println("✗ Book not found.");
            return;
        }

        String confirm = getStringInput("Are you sure you want to delete? (yes/no): ");
        if (confirm.equalsIgnoreCase("yes")) {
            if (bookDAO.deleteBook(id))
                System.out.println("✓ Book deleted successfully!");
            else
                System.out.println("✗ Failed to delete book.");
        } else {
            System.out.println("✗ Deletion cancelled.");
        }
    }

    private static void viewInventoryValue() throws SQLException {
        double totalValue = bookDAO.getTotalInventoryValue();
        int totalBooks = bookDAO.getAllBooks().size();

        System.out.println("Total Books: " + totalBooks);
        System.out.println("Total Inventory Value: $" + String.format("%.2f", totalValue));
    }
}
