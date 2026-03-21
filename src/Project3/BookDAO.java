package Project3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    private final Connection con;
    public BookDAO(Connection con) {
        this.con = con;
    }

    public boolean addBook(Book book) throws SQLException{
        String query = "INSERT INTO project (bookName,author,price) VALUES (?,?,?);";
       try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1, book.getBookName());
            ps.setString(2, book.getAuthor());
            ps.setDouble(3, book.getPrice());
            int rowAffected= ps.executeUpdate();
            if(rowAffected>0){
                con.commit();
                return true;
            }
            else{
                con.rollback();
                return false;
            }
       }
    }
    public boolean removeBook(int bookId) throws SQLException{
        String query = "DELETE FROM project WHERE bookId = ?;";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1, bookId);
            int rowAffected= ps.executeUpdate();
            if(rowAffected>0){
                con.commit();
                return true;
            }
            else{
                con.rollback();
                return false;
            }
        }
    }
    public boolean updateBook(Book book,int bookId) throws SQLException{
        String query = "update project set bookName = ?, author = ?, price = ? where bookId = ?;";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1, book.getBookName());
            ps.setString(2, book.getAuthor());
            ps.setDouble(3, book.getPrice());
            ps.setInt(4, bookId);
            int rowAffected= ps.executeUpdate();
            if(rowAffected>0){
                con.commit();
                return true;
            }
            else{
                con.rollback();
                return false;
            }
        }
    }
    public Book searchBook(int bookId) throws SQLException{
        String query = "SELECT * FROM project WHERE bookId = ?;";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1, bookId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               return new Book(rs.getInt("bookId"),
                       rs.getString("bookName"),
                       rs.getString("author"),
                       rs.getDouble("price"),
                      rs.getObject("uploadedAt", LocalDateTime.class));
            }
        }
        return null;
    }
    public List<Book> displayBooks() throws SQLException{
        List<Book> arr = new ArrayList<>();
        String query = "SELECT * FROM project;";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                arr.add(new Book(rs.getInt("bookId"),
                        rs.getString("bookName"),
                        rs.getString("author"),
                        rs.getDouble("price"),
                        rs.getObject("uploadedAt", LocalDateTime.class)));
            }
        }
        return arr;
    }
}
