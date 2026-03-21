package OOPsPractice;

import java.sql.*;
import java.util.Scanner;

public class HotelReservationSystem {
    private static final String url ="jdbc:mysql://localhost:3306/hospital";
    private static final String user ="root";
    private static final String password ="pop99558$$";

    public static void main(String[] args)  throws SQLException , ClassNotFoundException,RuntimeException,InterruptedException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        while (true) {
            System.out.println();
            System.out.println("Welcome to Hotel ReservationSystem");
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Reservation a Room");
            System.out.println("2. View Reservation");
            System.out.println("3. Get Room Number");
            System.out.println("4. Update Reservation");
            System.out.println("5. Delete Reservation");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    reserveRoom(connection, scanner);
                    break;
                case 2:
                    viewReservation(connection,scanner);
                    break;
                case 3:
                    getRoomNumber(connection, scanner);
                    break;
                case 4:
                    updatereservation(connection, scanner);
                case 5:
                    deleteReservation(connection, scanner);
                    break;
                case 6:
                    exit();
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice... try again");

            }
        }
    }
    private static void reserveRoom(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Enter Guest Name: ");
        String name = scanner .next();
        scanner.nextLine();
        System.out.println("Enter Room Number: ");
        int roomNumber = scanner.nextInt();
        System.out.println("Enter Contact Number: ");
        String contactNumber = scanner.next();
        String query = "INSERT INTO reservations (guest_name, room_number, contact_number)" +
                " VALUES ('" + name + "'," + roomNumber +", '" + contactNumber + "')";
        Statement statement = connection.createStatement();
        int rowsAffected = statement.executeUpdate(query);
        if (rowsAffected > 0) {
            System.out.println("Reservation has been reserved Successfully!");
        }
        else{
            System.out.println("Reservation Failed.");
        }
    }
    private static void viewReservation(Connection connection, Scanner scanner) throws SQLException {
        String query =  "SELECT reservation_id, guest_name, room_number, contact_number, reservation_date FROM reservations";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        System.out.println("Current Reservations:");
        System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
        System.out.println("| Reservation ID | Guest           | Room Number   | Contact Number      | Reservation Date        |");
        System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
        while(resultSet.next()) {
            int reservationId = resultSet.getInt("reservation_id");
            String guestName = resultSet.getString("guest_name");
            int roomNumber = resultSet.getInt("room_number");
            String contactNumber = resultSet.getString("contact_number");
            String reservationDate = resultSet.getTimestamp("reservation_date").toString();
            System.out.printf("| %-14d | %-15s | %-13d | %-20s | %-19s   |\n",
                    reservationId, guestName, roomNumber, contactNumber, reservationDate);
        }
        System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
    }
    private static void getRoomNumber(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Enter Reservation Id: ");
        int reservationId = scanner.nextInt();
        System.out.println("Enter Guest Name: ");
        String guestName = scanner.next();
        String query = "SELECT room_number FROM reservations " +
                "WHERE reservation_id = " + reservationId +
                " AND guest_name = '" + guestName + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        if(resultSet.next()) {
            int roomNumber = resultSet.getInt("room_number");
            System.out.println("Room number for Reservation ID " + reservationId +
                    " and Guest " + guestName + " is: " + roomNumber);
        }
        else{
            System.out.println("Reservation not found for the given ID and the guest name.");
        }
    }
    private static void updatereservation(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Enter reservation ID to update: ");
        int reservationId = scanner.nextInt();
        scanner.nextLine();
        if(!reservationExists(connection,reservationId)){
            System.out.println("Reservation ID not found.");
            return;
        }
        System.out.println("Enter new Guest Name: ");
        String newGuestName = scanner.next();
        System.out.println("Enter new Room Number: ");
        int newRoomNumber = scanner.nextInt();
        System.out.println("Enter new Contact Number: ");
        String newContactNumber = scanner.next();
        String query = "UPDATE reservations SET guest_name = '" + newGuestName + "', " +
                "room_number = " + newRoomNumber + ", " +
                "contact_number = '" + newContactNumber + "' " +
                "WHERE reservation_id = " + reservationId;
        Statement statement = connection.createStatement();
        int rowsAffected = statement.executeUpdate(query);
        if (rowsAffected > 0) {
            System.out.println("Reservation has been updated successfully!");
        }
        else{
            System.out.println("Reservation Failed.");
        }
    }
    private static void deleteReservation(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Enter reservation ID to delete: ");
        int reservationId = scanner.nextInt();
        if(!reservationExists(connection,reservationId))
        {
            System.out.println("Reservation ID not found.");
            return;
        }
        String query = "DELETE FROM reservations WHERE reservation_id = " + reservationId;
        Statement statement = connection.createStatement();
        int rowsAffected = statement.executeUpdate(query);
        if (rowsAffected > 0) {
            System.out.println("Reservation deleted successfully!");
        }
        else{
            System.out.println("Reservation  Deletion Failed.");
        }
    }
    private static boolean reservationExists(Connection connection, int reservationId) throws SQLException {
        String query = "SELECT reservation_id FROM reservations WHERE reservation_id = " + reservationId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet.next();

    }
    public static void exit() throws InterruptedException {
        System.out.println("Existing system");
        int i = 5;
        while(i!=0){
            System.out.println(".");
            Thread.sleep(1000);
            i--;
        }
        System.out.println();
        System.out.println("Thank you for using Hotel ReservationSystem!!!");
    }
}
