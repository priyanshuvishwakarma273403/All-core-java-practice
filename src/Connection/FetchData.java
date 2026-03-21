package Connection;

import java.sql.*;

public class FetchData {
    private  static String url =  "jdbc:mysql://localhost:3306/Practice";
    private static String user = "root";
    private static String password = "pop99558$$";


    public static void main(String[] args) throws SQLException , ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,user,password);
       Statement statement= conn.createStatement();

//        ResultSet resultSet = statement.executeQuery("select * from employees");
       // String sql = "UPDATE employees SET salary=salary+100 WHERE emp_id=1";
        String sql = "Delete from employees  where emp_name = 'John Smith'";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        int result = preparedStatement.executeUpdate();
        if(result>0){
            System.out.println("Update Successfully");
        }
        else{
            System.out.println("something went wrong");
        }

//        while (resultSet.next()) {
//            System.out.println("================================================");
//            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "
//                    +resultSet.getDouble(4)+" "+resultSet.getDate(5)+" "+resultSet.getString(6));
//        }
        conn.close();
        statement.close();
    }
}
