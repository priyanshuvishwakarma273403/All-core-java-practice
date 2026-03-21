package OOPsPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
class Book{
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner (System.in);
    int id;
    String title;
    String author;
    Book(int id, String title, String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }
    public String toString(){
       return "Book ID:"+id+" Title:"+title+" Author:"+author;
    }
    static void addBook(){
        System.out.println("Enter Book ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Title");
        String title = sc.nextLine();
        System.out.println("Enter Book Author");
        String author = sc.nextLine();
        books.add(new Book(id,title,author));
        System.out.println("Book added Successfully");
    }
    static void viewBook(){
        if(books.isEmpty()){
            System.out.println("No book in library");
        }
        else{
            System.out.println("====All Books====");
            for(Book ele:books){
                System.out.println(ele);
            }
        }
    }
    static void searchBook(){
        System.out.println("Enter Book ID to search");
        int id = sc.nextInt();
        for(Book ele:books){
            if(ele.id==id){
                System.out.println("Found book"+ele);
                return;
            }
        }
        System.out.println("Book not found");
    }
    static void deleteBook(){
        System.out.println("Enter Book ID to delete:");
        int id = sc.nextInt();
        for(Book ele:books){
            if(ele.id==id){
                books.remove(ele);
                System.out.println("Book deleted successfully");
                return;
            }
        }
    }
    public void showHistory(){
        System.out.println("Book History:");
        for(Book ele:books){
            System.out.println(ele+" ");
        }
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.println("Enter Book ID:");
            int id = sc.nextInt();
            System.out.println("Enter Book Title:");
            String title = sc.next();
            System.out.println("Enter Book Author:");
            String author = sc.next();

            Book book = new Book(id, title, author);

            try {
                while (true) {
                    System.out.println("\n====Enter Menu====");
                    System.out.println("1. Add Book");
                    System.out.println("2. Search Book");
                    System.out.println("3. Delete Book");
                    System.out.println("4. View Books");
                    System.out.println("5. View History");
                    System.out.println("6. Exit");
                    System.out.println("Choose:");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            book.addBook();
                            break;
                        case 2:
                            book.searchBook();
                            break;
                        case 3:
                            book.deleteBook();
                            break;
                        case 4:
                            book.viewBook();
                            break;
                        case 5:
                            book.showHistory();
                            break;
                        case 6:
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice");
                    }
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Enter only Interger"+e.getMessage());
            }
            catch(Exception e) {
                System.out.println("Enter only Character "+e.getMessage());
            }
        }
        catch(Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
