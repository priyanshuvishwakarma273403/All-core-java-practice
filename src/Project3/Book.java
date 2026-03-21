package Project3;
 import java.time.LocalDateTime;

public class Book {

    public Book() {}

    private int bookId;
    private String bookName;
    private String author;
    private double price;
    private LocalDateTime uploadedAt;

    public Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public Book(int bookId,String bookName,String author,double price,LocalDateTime uploadedAt) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.uploadedAt = uploadedAt;
    }
    public int getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    @Override
    public String toString(){
        return String.format("%-10s %-20s %-20s %-15s %-15s %n",
                bookId,bookName,author,price,uploadedAt);
    }
}
