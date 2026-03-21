package Project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url = "jdbc:mysql://localhost:3306/students";
    private static final String user = "root";
    private static final String password = "pop99558$$";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        return  DriverManager.getConnection(url,user,password);

    }

}
