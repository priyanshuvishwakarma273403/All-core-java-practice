package Project06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DatabaseConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";
    private static final String PASSWORD = "pop99558$$";
    private static final int POOL_SIZE =10;

    private static BlockingQueue<Connection> connectionPool = new LinkedBlockingQueue<>(POOL_SIZE);

    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            for(int i=0;i<POOL_SIZE;i++){
                connectionPool.offer(createConnection());
            }

            System.out.println("Connection pool initialized with "+POOL_SIZE+" connections");
        }catch (ClassNotFoundException e){
            System.err.println("MySQL Driver not found: " + e.getMessage());
        }catch (SQLException e){
            System.err.println("Error initializing connection pool: " + e.getMessage());
        }
    }

    private static Connection createConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static Connection getConnection() throws InterruptedException,SQLException{
        Connection conn =  connectionPool.poll();
        if(conn==null || conn.isClosed()){
            conn =createConnection();
        }
        return conn;
    }

    public static void releaseConnection(Connection connection){
        if(connection!=null){
            try{
                if(!connection.isClosed()){
                    connectionPool.offer(connection);
                }
            }catch (SQLException e){
                System.out.println("Error releasing connection: " + e.getMessage());
            }
        }
    }

    public static void closeAllConnections(){
        for(Connection conn :  connectionPool){
            try{
                if(conn != null && !conn.isClosed()){
                    conn.close();
                }
            } catch (SQLException e){
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
        connectionPool.clear();
    }

}
