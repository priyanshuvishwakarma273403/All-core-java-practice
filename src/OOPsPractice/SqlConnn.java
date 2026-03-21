package OOPsPractice;
import java.sql.*;


public class SqlConnn {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LibraryManagement", "root", "pop99558$$");
            System.out.println("Connection Successful!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
