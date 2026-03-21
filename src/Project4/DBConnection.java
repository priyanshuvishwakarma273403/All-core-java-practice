package Project4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pop99558$$");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
