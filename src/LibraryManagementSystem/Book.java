package LibraryManagementSystem;

import java.sql.Connection;
import java.util.Scanner;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private int quantity;
    private double price;
    private Connection connection;
    private Scanner scanner;
    public Book(){
        super();
        this.scanner = scanner;
        this.connection = connection;
    }
    public Book(String isbn, String title, String author, String publisher, int yearPublished, int quantity,
               double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.quantity = quantity;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher="
                + publisher + ", yearPublished=" + yearPublished + ", quantity=" + quantity + ", price=" + price + "]";
    }
}
