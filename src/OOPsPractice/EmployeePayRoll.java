//package OOPsPractice;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//abstract class Employee {
//    private String name;
//    private int id;
//
//    public Employee(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    // Abstract method to be implemented by subclasses
//    public abstract double calculateSalary();
//
//    @Override
//    public String toString() {
//        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
//    }
//}
//
//class FullTimeEmployee extends Employee {
//    private double monthlySalary;
//
//    public FullTimeEmployee(String name, int id, double monthlySalary) {
//        super(name, id);
//        this.monthlySalary = monthlySalary;
//    }
//
//    @Override
//    public double calculateSalary() {
//        return monthlySalary;
//    }
//}
//
//class PartTimeEmployee extends Employee {
//    private int hoursWorked;
//    private double hourlyRate;
//
//    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
//        super(name, id);
//        this.hoursWorked = hoursWorked;
//        this.hourlyRate = hourlyRate;
//    }
//
//    @Override
//    public double calculateSalary() {
//        return hoursWorked * hourlyRate;
//    }
//}
//
//class PayrollSystem {
//    private static final String url = "jdbc:mysql://localhost:3306/";
//    private static final String username = "root";
//    private static final String password = "root";
//    public PayrollSystem() {
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(url, username, password);
//        }
//        catch (ClassNotFoundException e){
//            e.printStackTrace();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void addEmployee(Employee employee,Connection conn) throws SQLException{
//        try{
//            String query ="insert into payroll(id, name, type, monthly_salary, hours_worked, hourly_rate) VALUES (?, ?, ?, ?, ?, ?)";
//            PreparedStatement preparedStatement= conn.prepareStatement(query);
//            preparedStatement.setInt(1, employee.getId());
//            preparedStatement.setString(2, employee.getName());
//            if(employee instanceof FullTimeEmployee){
//                FullTimeEmployee e = (FullTimeEmployee) employee;
//                preparedStatement.setString(3, "FullTime");
//                PreparedStatement.setDouble(4, e.getMonthlySalary());
//                preparedStatement.setInt(5, java.sql.Types.INTEGER);
//                preparedStatement.setInt(6, java.sql.Types.DOUBLE);
//
//
//
//
//            }
//        }
//
//    }
//
//
//
//}
//
//public class EmployeePayRoll {
//    public static void main(String[] args) {
//
//
//    }
//}

//package OOPsPractice;
//
//import java.sql.*;
//import java.util.Scanner;
//
//// -------------------- Abstract Class --------------------
//abstract class Employee {
//    private String name;
//    private int id;
//
//    public Employee(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    public String getName() { return name; }
//    public int getId() { return id; }
//    public abstract double calculateSalary();
//}
//
//// -------------------- FullTimeEmployee --------------------
//class FullTimeEmployee extends Employee {
//    private double monthlySalary;
//
//    public FullTimeEmployee(String name, int id, double monthlySalary) {
//        super(name, id);
//        this.monthlySalary = monthlySalary;
//    }
//
//    @Override
//    public double calculateSalary() {
//        return monthlySalary;
//    }
//
//    public double getMonthlySalary() { return monthlySalary; }
//}
//
//// -------------------- PartTimeEmployee --------------------
//class PartTimeEmployee extends Employee {
//    private int hoursWorked;
//    private double hourlyRate;
//
//    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
//        super(name, id);
//        this.hoursWorked = hoursWorked;
//        this.hourlyRate = hourlyRate;
//    }
//
//    @Override
//    public double calculateSalary() {
//        return hoursWorked * hourlyRate;
//    }
//
//    public int getHoursWorked() { return hoursWorked; }
//    public double getHourlyRate() { return hourlyRate; }
//}
//
//// -------------------- PayrollSystem (JDBC) --------------------
//class PayrollSystem {
//    private Connection conn;
//
//    public PayrollSystem() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/payroll_db", "root", "your_password" // ← change password
//            );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Add Employee
//    public void addEmployee(Employee employee) {
//        try {
//            String query = "INSERT INTO employees (id, name, type, monthly_salary, hours_worked, hourly_rate) VALUES (?, ?, ?, ?, ?, ?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setInt(1, employee.getId());
//            ps.setString(2, employee.getName());
//
//            if (employee instanceof FullTimeEmployee) {
//                FullTimeEmployee e = (FullTimeEmployee) employee;
//                ps.setString(3, "FullTime");
//                ps.setDouble(4, e.getMonthlySalary());
//                ps.setNull(5, java.sql.Types.INTEGER);
//                ps.setNull(6, java.sql.Types.DOUBLE);
//            } else {
//                PartTimeEmployee e = (PartTimeEmployee) employee;
//                ps.setString(3, "PartTime");
//                ps.setNull(4, java.sql.Types.DOUBLE);
//                ps.setInt(5, e.getHoursWorked());
//                ps.setDouble(6, e.getHourlyRate());
//            }
//
//            ps.executeUpdate();
//            System.out.println("✅ Employee added successfully!");
//        } catch (SQLException e) {
//            System.out.println("⚠️ Error adding employee: " + e.getMessage());
//        }
//    }
//
//    // Remove Employee
//    public void removeEmployee(int id) {
//        try {
//            String query = "DELETE FROM employees WHERE id = ?";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setInt(1, id);
//            int rows = ps.executeUpdate();
//
//            if (rows > 0)
//                System.out.println("🗑️ Employee removed successfully!");
//            else
//                System.out.println("⚠️ Employee not found!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Display All Employees
//    public void displayEmployees() {
//        try {
//            String query = "SELECT * FROM employees";
//            Statement st = conn.createStatement();
//            ResultSet rs = st.executeQuery(query);
//
//            System.out.println("\n📋 Employee List:");
//            boolean empty = true;
//
//            while (rs.next()) {
//                empty = false;
//                String type = rs.getString("type");
//                String name = rs.getString("name");
//                int id = rs.getInt("id");
//
//                if (type.equals("FullTime")) {
//                    double salary = rs.getDouble("monthly_salary");
//                    System.out.println("Full-Time → ID: " + id + ", Name: " + name + ", Salary: " + salary);
//                } else {
//                    int hours = rs.getInt("hours_worked");
//                    double rate = rs.getDouble("hourly_rate");
//                    System.out.println("Part-Time → ID: " + id + ", Name: " + name + ", Hours: " + hours + ", Rate: " + rate + ", Salary: " + (hours * rate));
//                }
//            }
//
//            if (empty) System.out.println("No employees found.");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Close Connection
//    public void close() {
//        try {
//            if (conn != null) conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

// -------------------- Main Class --------------------
//public class EmployeePayRoll {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        PayrollSystem payroll = new PayrollSystem();
//        int choice;
//
//        do {
//            System.out.println("\n========= PAYROLL SYSTEM =========");
//            System.out.println("1. Add Employee");
//            System.out.println("2. Remove Employee");
//            System.out.println("3. Display All Employees");
//            System.out.println("4. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter Employee ID: ");
//                    int id = sc.nextInt();
//                    sc.nextLine(); // consume newline
//
//                    System.out.print("Enter Employee Name: ");
//                    String name = sc.nextLine();
//
//                    System.out.print("Enter Employee Type (FullTime/PartTime): ");
//                    String type = sc.next();
//
//                    if (type.equalsIgnoreCase("FullTime")) {
//                        System.out.print("Enter Monthly Salary: ");
//                        double salary = sc.nextDouble();
//                        FullTimeEmployee fte = new FullTimeEmployee(name, id, salary);
//                        payroll.addEmployee(fte);
//                    } else if (type.equalsIgnoreCase("PartTime")) {
//                        System.out.print("Enter Hours Worked: ");
//                        int hours = sc.nextInt();
//                        System.out.print("Enter Hourly Rate: ");
//                        double rate = sc.nextDouble();
//                        PartTimeEmployee pte = new PartTimeEmployee(name, id, hours, rate);
//                        payroll.addEmployee(pte);
//                    } else {
//                        System.out.println("⚠️ Invalid Employee Type!");
//                    }
//                    break;
//
//                case 2:
//                    System.out.print("Enter Employee ID to remove: ");
//                    int removeId = sc.nextInt();
//                    payroll.removeEmployee(removeId);
//                    break;
//
//                case 3:
//                    payroll.displayEmployees();
//                    break;
//
//                case 4:
//                    System.out.println("👋 Exiting Payroll System...");
//                    payroll.close();
//                    break;
//
//                default:
//                    System.out.println("⚠️ Invalid Choice! Try again.");
//            }
//        } while (choice != 4);
//
//        sc.close();
//    }
//}
//
//
//
//
//
//

























//
package OOPsPractice;
import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem {
    private List<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class EmployeePayRoll {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 101, 5000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith", 102, 30, 15.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployees();

        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(101);

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();
    }
}