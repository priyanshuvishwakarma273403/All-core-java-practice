package OOPsPractice;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// Database helper class
class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/bank_simulator";
    private static final String USER = "root";
    private static final String PASSWORD = "pop99558$$"; // change this

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

// Bank Account Class
class BankAccount {
    private int id;
    private String name;
    private double balance;
    private ArrayList<String> history = new ArrayList<>();

    BankAccount(String name, double balance) throws SQLException {
        this.name = name;
        this.balance = balance;
        saveAccountToDB();
        history.add("Account opened with balance: " + balance);
        saveTransaction("Account opened with balance: " + balance);
    }

    private void saveAccountToDB() throws SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO accounts (name, balance) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, name);
        ps.setDouble(2, balance);
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) id = rs.getInt(1);

        conn.close();
    }

    private void saveTransaction(String details) throws SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO transactions (account_id, details) VALUES (?, ?)");
        ps.setInt(1, id);
        ps.setString(2, details);
        ps.executeUpdate();
        conn.close();
    }

    public void deposit(double amount) throws SQLException {
        if (amount > 0) {
            balance += amount;
            updateBalanceInDB();
            history.add("Deposited: " + amount);
            saveTransaction("Deposited: " + amount);
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) throws InsufficientBalanceException, SQLException {
        if (amount <= 0) {
            System.out.println("Withdrawal must be greater than 0");
            return;
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance! Current: " + balance);
        }
        balance -= amount;
        updateBalanceInDB();
        history.add("Withdrawn: " + amount);
        saveTransaction("Withdrawn: " + amount);
        System.out.println("Amount Withdrawn: " + amount);
    }

    private void updateBalanceInDB() throws SQLException {
        Connection conn = Database.getConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE accounts SET balance = ? WHERE id = ?");
        ps.setDouble(1, balance);
        ps.setInt(2, id);
        ps.executeUpdate();
        conn.close();
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showHistory() throws SQLException {
        System.out.println("---- Transaction History ----");
        Connection conn = Database.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT details FROM transactions WHERE account_id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("details"));
        }
        conn.close();
    }
}
public class BankSimulator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount acc = new BankAccount(name, balance);

            while (true) {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Balance");
                System.out.println("4. History");
                System.out.println("5. Exit");
                System.out.print("Choose: ");

                int ch = sc.nextInt();
                try {
                    switch (ch) {
                        case 1:
                            System.out.print("Enter amount: ");
                            acc.deposit(sc.nextDouble());
                            break;
                        case 2:
                            System.out.print("Enter amount: ");
                            acc.withdraw(sc.nextDouble());
                            break;
                        case 3:
                            acc.showBalance();
                            break;
                        case 4:
                            acc.showHistory();
                            break;
                        case 5:
                            System.out.println("Thank you see you soon !!");
                            return;
                        default:
                            System.out.println("Invalid choice!");
                    }
                } catch (InsufficientBalanceException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
