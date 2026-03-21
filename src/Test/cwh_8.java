package Test;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private String isbn;
    public static int books=0;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        books++;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;

    }
    public String getIsbn() {
        return isbn;
    }
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);

    }

}
 class Library{
    private ArrayList<Book> books = new ArrayList<>();
public void addBook(String title, String author, String isbn){
    Book book = new Book(title, author, isbn);
    books.add(book);
    System.out.println("Add book successfully");
}
public void removeBook( String isbn){
    for(Book book:books){
        if(book.getIsbn().equals(isbn)){
            books.remove(book);
            book.books--;
            System.out.println("Remove book successfully");
            return;
        }
    }
    System.out.println("Book not found");
    }
    public void searchBook(String title){
    for(Book book:books){
        if(book.getTitle().equalsIgnoreCase(title)){
            System.out.println("Book found");
            book.display();
            return;
        }
    }
        System.out.println("Book not found");
    }
    public void showAllBooks(){
       if(books.isEmpty()){
           System.out.println("No books in the library");
       }
       else {
           System.out.println("Books in the library");
           for(Book book:books){
               book.display();
           }
       }
        System.out.println("Total books"+Book.books);

    }
}
public class cwh_8 {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====Library System======");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Show All Books");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter title");
                    String title = sc.nextLine();
                    System.out.println("Enter author");
                    String author = sc.nextLine();
                    System.out.println("Enter isbn");
                    String isbn = sc.nextLine();
                    library.addBook(title, author, isbn);
                    break;
                case 2:
                    System.out.println("Enter ISBN to remove");
                    String removeISBN = sc.nextLine();
                    library.removeBook(removeISBN);
                    break;
                case 3:
                    System.out.println("Enter title to search");
                    String searchTitle = sc.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case 4:
                    library.showAllBooks();
                    break;
                case 5:
                    System.out.println("Exit Library System .........GOOD BYE !");
                    sc.close();
                    System.exit(0);
                default:

                    System.out.println("Invalid choice...   TRY AGAIN!");
            }
        }
    }
}



