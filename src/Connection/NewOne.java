package Connection;

import java.sql.*;

public class NewOne {
    private static String url =  "jdbc:mysql://localhost:3306/Practice" ;
    private static String user = "root";
    private static String password = "pop99558$$";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,user,password);
        String sql = "update employees  set salary = 80000 where emp_id =2";
        PreparedStatement ps = conn.prepareStatement(sql);
        int result = ps.executeUpdate();
        if(result>0){
            System.out.println("Successfully updated");
        }
        else {
            System.out.println("Failed");
        }
        conn.close();
        ps.close();
    }
}
