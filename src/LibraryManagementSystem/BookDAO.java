package LibraryManagementSystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDAO {
    private Connection connection;
    public BookDAO( Connection connection) {
        this.connection = connection;
    }

    public boolean addBook(Book book) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO books (isbn, title, author, publisher, year_published, quantity, price) values(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, book.getIsbn());
        preparedStatement.setString(2, book.getTitle());
        preparedStatement.setString(3, book.getAuthor());
        preparedStatement.setString(4, book.getPublisher());
        preparedStatement.setInt(5, book.getYearPublished());
        preparedStatement.setInt(6, book.getQuantity());
        preparedStatement.setDouble(7, book.getPrice());
        int result = preparedStatement.executeUpdate();
        System.out.println("Book added successfully! Rows affected: " + result);
        return result > 0;
    }
    public List<Book> getAllBooks() throws SQLException
    {
        List<Book> books = new ArrayList<Book>();
        String query = "Select * from books order by id";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            books.add(extractBookFromResultSet(resultSet));
        }
        System.out.println("Fetched " + books.size() + " books successfully.");

        return books;
    }
    public Book getBookById(int id) throws SQLException {
        String query = "SELECT * FROM books WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            return extractBookFromResultSet(rs);
        }
        System.out.println("Book not found with ID: " + id);
        return null;

    }
    public List<Book> searchBooks(String keyword) throws SQLException {
        List<Book> books = new ArrayList<>();
        String query = "SELECT * FROM books WHERE title LIKE ? OR author LIKE ? ORDER BY title";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        String searchPattern = "%" + keyword + "%";
        preparedStatement.setString(1, searchPattern);
        preparedStatement.setString(2, searchPattern);

        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            books.add(extractBookFromResultSet(rs));
        }
        System.out.println("Found " + books.size() + " matching books for: " + keyword);
        return books;
    }

        public boolean updateBook(Book book) throws SQLException, ClassNotFoundException {
        String query = "UPDATE books SET isbn = ?, title = ?, author = ?, publisher = ?, " +
                "year_published = ?, quantity = ?, price = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, book.getIsbn());
        preparedStatement.setString(2, book.getTitle());
        preparedStatement.setString(3, book.getAuthor());
        preparedStatement.setString(4, book.getPublisher());
        preparedStatement.setInt(5, book.getYearPublished());
        preparedStatement.setInt(6, book.getQuantity());
        preparedStatement.setDouble(7, book.getPrice());
        preparedStatement.setInt(8, book.getId());
        int result = preparedStatement.executeUpdate();
            System.out.println("Book updated successfully! Rows affected: " + result);
            return result > 0;
    }
    public boolean deleteBook(int id) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM books WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int rowsAffected = preparedStatement.executeUpdate();
        System.out.println("Deleted book with ID " + id + ". Rows affected: " + rowsAffected);
        return rowsAffected > 0;
    }

    private Book extractBookFromResultSet(ResultSet resultSet) throws SQLException
    {
        Book book = new Book();
        book.setId(resultSet.getInt("id"));
        book.setIsbn(resultSet.getString("isbn"));
        book.setTitle(resultSet.getString("title"));
        book.setAuthor(resultSet.getString("author"));
        book.setPublisher(resultSet.getString("publisher"));
        book.setYearPublished(resultSet.getInt("year_published"));
        book.setQuantity(resultSet.getInt("quantity"));
        book.setPrice(resultSet.getDouble("price"));
        return book;
    }
    public double getTotalInventoryValue() throws SQLException {
        String query = "SELECT SUM(quantity * price) as total FROM books";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        if(resultSet.next()) {
            return resultSet.getDouble("total");
        }
        System.out.println("Calculated total inventory value successfully.");

        return 0.0;
    }
}
