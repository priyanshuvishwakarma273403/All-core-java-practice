package JDBCConnecting;

import java.sql.*;
import java.util.Scanner;

public class PrepareStatementCheck {
    private static final String url = "jdbc:mysql://localhost:3306/hospital";
    private static final String user = "root";
    private static final String password = "pop99558$$";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
       while(true){
           System.out.println("Welcome to MySQL JDBC Connecting");
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Student ID");
           int id = sc.nextInt();
           sc.nextLine();
           System.out.println("Enter Student Name");
           String name = sc.next();
           System.out.println("Enter Student email");
           String email = sc.next();
           System.out.println("Enter Student age");
           int age = sc.nextInt();
           System.out.println("Enter student cgpa");
           int cgpa = sc.nextInt();

           String query ="Insert into students (id,name,email,age,cgpa) values (?, ?, ?, ?,?)";
           PreparedStatement pstmt = conn.prepareStatement(query);
           pstmt.setInt(1, id);
           pstmt.setString(2, name);
           pstmt.setString(3, email);
           pstmt.setInt(4, age);
           pstmt.setInt(5, cgpa);
           int result = pstmt.executeUpdate();
           if(result>0){
               System.out.println("Your student has been inserted");
           }
           else{
               System.out.println("Your student has not been inserted");
           }
       }
    }
}
