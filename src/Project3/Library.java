package Project3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Library {
    private static final String url = "jdbc:mysql://localhost:3306/project";
    private static final String username = "root";
    private static final String password = "pop99558$$";

    public static void main(String[] args)throws SQLException, ClassNotFoundException,InterruptedException,IllegalArgumentException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Scanner sc = new Scanner(System.in);
        con.setAutoCommit(false);

        BookService service = new BookService(con);
        boolean exit = false;
        while(!exit){
            System.out.println("""
                    ───────────── Movie Menu ─────────────
                    [1] ➤ Add Book
                    [2] ➤ Remove Book
                    [3] ➤ Update Book
                    [4] ➤ Search Book
                    [5] ➤ Display All Book
                    [6] ➤ Exit
                    ─────────────────────────────────────
                    """);
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Book Name: ");
                    String bookName = sc.nextLine();
                    System.out.println("Enter Book Author: ");
                    String author = sc.nextLine();
                    System.out.println("Enter Book Price: ");
                    double price = sc.nextDouble();

                    Book book = new Book(bookName,author,price);
                    boolean added = service.addBook(book);
                    System.out.println(added ? "Book added successfully!":"Book add failed!");
                    break;
                case 2:
                    System.out.println("Enter BookId: ");
                    int bookId = sc.nextInt();

                    System.out.println("---------------------------------------------------");
                    boolean removed = service.removeBook(bookId);
                    System.out.println(removed ? "Book removed successfully!":"Failed Book removed!!!\n");
                    break;
                case 3:
                    System.out.println("Enter BookId: ");
                    int bookId3 = sc.nextInt();


                    sc.nextLine();
                    System.out.println("Enter bookName");
                    String bookName1 = sc.nextLine();
                    System.out.println("Enter bookAuthor");
                    String bookAuthor1 = sc.nextLine();
                    System.out.println("Enter bookPrice");
                    double price1 = sc.nextDouble();
                    Book book1 = new Book(bookName1,bookAuthor1,price1);
                    boolean update = service.updateBook(book1,bookId3);

                    System.out.println("---------------------------------------------------------------------");
                    System.out.println(update ? "Book updated successfully!":" Failed to updated!!!\n");
                    break;

                case 4:
                    System.out.println("Enter bookId");
                    int bookId2 = sc.nextInt();
                    System.out.println("---------------------------------------------------------");
                    Book found = service.searchBook(bookId2);
                    if(found!=null){
                        System.out.printf("%-10s %-20s %-20s %-15s %-15s %n",
                                "bookId","bookName","bookAuthor","bookPrice","uploadedAt");
                        System.out.println(found);
                    }
                    else{
                        System.out.println("Book not found!");
                    }
                    System.out.println("---------------------------------------------------------------\n");
                    break;

                case 5:
                    List<Book> arr = service.displayBooks();

                    if(arr.isEmpty()){
                        System.out.println("No books found in database!!!\n");
                    }
                    else{
                        System.out.printf("%-10s %-20s %-20s %-15s %-15s %n",
                                "bookId","bookName","bookAuthor","bookPrice","uploadedAt");
                        System.out.println("---------------------------------------------------");
                        for(Book ele : arr){
                            System.out.println(ele);
                        }
                        System.out.println("------------------------------------------------------");
                        System.out.println("Total Books: "+arr.size()+"\n");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
            }

        }
        con.close();
        sc.close();
        System.out.println("Program is Ended!!!");
    }
}
