package Project3;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BookService {

    private final BookDAO dao;

    public BookService(Connection con) {
       this.dao = new BookDAO(con);
    }

    public boolean addBook(Book book) {
        try{
            if(book.getBookName().isBlank() || book.getAuthor().isBlank() || book.getPrice()<=0){
                System.out.println("Book Name or Author or Price can't be empty");
                return false;
            }
           return dao.addBook(book);
        }
        catch(SQLException e){
            System.out.println("DataBase error while adding Book"+e.getMessage());
            return false;
        }
    }

    public boolean removeBook(int bookId) {
        try{
            return dao.removeBook(bookId);
        } catch (SQLException e) {
            System.out.println("DataBase error while removing Book"+e.getMessage());
            return false;
        }
    }

    public boolean updateBook(Book book,int bookId) {
        try{
            if(book.getBookName().isBlank() || book.getAuthor().isBlank() || book.getPrice()<=0){
                System.out.println("Book Name or Author or Price can't be empty");
                return false;
            }
            return dao.updateBook(book,bookId);
        } catch (SQLException e) {
            System.out.println("DataBase error while updating Book"+e.getMessage());
            return false;
        }
    }
    public Book searchBook(int bookId) {
        try{
            return dao.searchBook(bookId);
        } catch (SQLException e) {
            System.out.println("DataBase error while searching Book"+e.getMessage());
            return  null;
        }
    }
    public List<Book> displayBooks() {
        try{
            return dao.displayBooks();
        } catch (SQLException e) {
            System.out.println("DataBase error while displaying Books"+e.getMessage());
            return  List.of();
        }
    }
}
