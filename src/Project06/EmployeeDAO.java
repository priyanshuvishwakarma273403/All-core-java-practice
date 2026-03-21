package Project06;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EmployeeDAO {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS employees (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(100) NOT NULL, " +
                "department VARCHAR(50) NOT NULL, " +
                "salary DOUBLE NOT NULL, " +
                "email VARCHAR(100) UNIQUE NOT NULL)";

        Connection conn = null;
        try{
            conn = DatabaseConfig.getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Table 'employees' created or already exists");

        }catch (SQLException | InterruptedException e ){
            System.err.println("Error creating table 'employees'" + e.getMessage());
        } finally {
            DatabaseConfig.releaseConnection(conn);
        }
    }

    public boolean insertEmployee(Employee employee){
        String sql =  "INSERT INTO employees (name, department, salary, email) VALUES (?, ?, ?, ?)";
        lock.writeLock().lock();
        Connection conn = null;
        try{
            conn = DatabaseConfig.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getDepartment());
            pstmt.setDouble(3, employee.getSalary());
            pstmt.setString(4, employee.getEmail());

            int rowAffected = pstmt.executeUpdate();
            if(rowAffected > 0){
                ResultSet rs = pstmt.getGeneratedKeys();
                if(rs.next()){
                    employee.setId(rs.getInt(1));
                }
                return true;
            }
        }catch (SQLException | InterruptedException e ){
            System.err.println("Error inserting employee: " + e.getMessage());
        } finally {
            lock.writeLock().unlock();
            DatabaseConfig.releaseConnection(conn);
        }
        return false;
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees";

        lock.readLock().lock();
        Connection conn = null;
        try{
            conn = DatabaseConfig.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                Employee emp = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary"),
                        rs.getString("email")
                );
                employees.add(emp);
            }

        }catch (SQLException | InterruptedException e ){
            System.err.println("Error fetching employees: " + e.getMessage());
        } finally {
            lock.readLock().unlock();
            DatabaseConfig.releaseConnection(conn);
        }
        return employees;
    }

    public Employee getEmployeeById(int id){
        String sql = "SELECT * FROM employees WHERE id = ?";
        lock.readLock().lock();
        Connection conn = null;
        try{
            conn = DatabaseConfig.getConnection();
            PreparedStatement pstmt =  conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                return new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary"),
                        rs.getString("email")
                );
            }
        }catch (SQLException | InterruptedException e ){
            System.err.println("Error fetching employee: " + e.getMessage());
        } finally {
            lock.readLock().unlock();
            DatabaseConfig.releaseConnection(conn);
        }
        return null;
    }

    public boolean updateEmployee(Employee employee){
        String sql = "UPDATE employees SET name=?, department=?, salary=?, email=? WHERE id=?";
        lock.writeLock().lock();
        Connection conn = null;
        try{
            conn = DatabaseConfig.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,employee.getName());
            pstmt.setString(2, employee.getDepartment());
            pstmt.setDouble(3, employee.getSalary());
            pstmt.setString(4, employee.getEmail());
            pstmt.setInt(5, employee.getId());

            return pstmt.executeUpdate() > 0;
        }catch (SQLException | InterruptedException e ){
            System.err.println("Error updating employee: " + e.getMessage());
        }finally {
            lock.writeLock().unlock();
            DatabaseConfig.releaseConnection(conn);
        }
        return false;
    }

    public boolean deleteEmployee(int id ){
        String sql = "DELETE FROM employees WHERE id = ?";
        lock.writeLock().lock();
        Connection conn = null;
        try{
            conn = DatabaseConfig.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            return pstmt.executeUpdate() > 0;

        }catch (SQLException | InterruptedException e ){
            System.err.println("Error deleting employee: " + e.getMessage());
        }finally {
            lock.writeLock().unlock();
            DatabaseConfig.releaseConnection(conn);
        }
        return false;
    }

    public List<Employee> getEmployeesByDepartment(String department){
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees WHERE department = ?";

        lock.readLock().lock();
        Connection conn = null;
        try{
            conn = DatabaseConfig.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, department);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                employees.add(new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary"),
                        rs.getString("email")
                ));
            }
        }catch (SQLException | InterruptedException e ){
            System.err.println("Error fetching employees by department: " + e.getMessage());
        }finally {
            lock.readLock().unlock();
            DatabaseConfig.releaseConnection(conn);
        }
        return employees;
    }
}
