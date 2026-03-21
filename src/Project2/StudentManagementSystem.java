package Project2;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        while (true) {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║       🎓 STUDENT MANAGEMENT SYSTEM     ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║  1. Add Student                      ║");
            System.out.println("║  2. View All Students                ║");
            System.out.println("║  3. Update Student Grade             ║");
            System.out.println("║  4. Delete Student                   ║");
            System.out.println("║  5. Exit                             ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("👉 Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter course: ");
                    String course = sc.nextLine();
                    System.out.println("Enter grade: ");
                    String grade = sc.nextLine();

                    Students student = new Students(name,age,course,grade);
                    dao.addStudent(student);
                    System.out.println("Student has been added successfully");
                    break;

                case 2:
                    List<Students> students = dao.getAllStudents();
                    students.forEach(System.out::println);
                    break;

                case 3:
                    System.out.println("Enter student ID to update: ");
                    int id  = sc.nextInt();
                    System.out.println("Enter new grade: ");
                    String newGrade = sc.nextLine();
                    dao.updateStudent(id, newGrade);
                    System.out.println("grade has been updated successfully");
                    break;

                case 4:
                    System.out.println("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    dao.deleteStudent(deleteId);
                    System.out.println("student has been deleted successfully");
                    break;

                case 5:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
