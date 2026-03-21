package OOPsPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int[] marks = new int[3];
    private int total;
    private double average;
    private String grade;

    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        calculateResults();
    }

    private void calculateResults() {
         total = 0;
        for (int mark : marks) total += mark;
        average = total / 3.0;

        if (average >= 90){
            grade = "A";
        }
        else if (average >= 70){
            grade = "B";
        }
        else if (average >= 55){
            grade = "C";
        }
        else if (average >= 40){
            grade = "D";
        }
        else{
            grade = "Fail";
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public void display() {
        System.out.println("--------------------------------------");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Marks    : " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total    : " + total);
        System.out.println("Average  : " + String.format("%.2f", average));
        System.out.println("Grade    : " + grade);
    }
}
//Printing main class
public class StudentManagementSystem {
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int count = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("\n===== Student Grade Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1: {
                        addStudent();
                        break;
                    }
                    case 2: {
                        viewStudents();
                        break;
                    }
                    case 3: {
                        searchStudent();
                        break;
                    }
                    case 4: {
                        deleteStudent();
                        break;
                    }
                    case 5: {
                        System.out.println(" Exit successfully....\nThank You!.....");
                        sc.close();
                        System.exit(0);
                        break;
                    }

                    default:
                        System.out.println("Invalid choice");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input ! Please enter a number only");
                sc.nextLine();
            }
            catch (Exception e) {
                System.out.println("Unexpected error occured. "+e.getMessage());
            }
        }
    }
        //work like above menu
    //add students
    private static void addStudent() {
        try {
            if (count >= MAX_STUDENTS) {
                System.out.println("Cannot add more students!");
                return;
            }

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new IllegalArgumentException("marks must be between 0 and 100");
                }
            }
            sc.nextLine();

            students[count++] = new Student(name, rollNo, marks);
            System.out.println("Student added successfully!");

        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number only for roll number and marks");
            sc.nextLine();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Something went wrong..."+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected error occured. "+e.getMessage());
        }
    }
    //view Students
    private static void viewStudents() {
        if (count == 0) {
            System.out.println("No students found!");
            return;
        }
        System.out.println("\n===== Student Report Card =====");
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }
    //search students
    private static void searchStudent() {
        try {
            if (count == 0) {
                System.out.println("No students found!");
                return;
            }
            System.out.print("Enter Roll Number to search: ");
            int rollNo = sc.nextInt();

            for (int i = 0; i < count; i++) {
                if (students[i].getRollNo() == rollNo) {
                    System.out.println("\nStudent Found:");
                    students[i].display();
                    return;
                }
            }
            System.out.println("Student with Roll No " + rollNo + " not found!");
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number only");
            sc.nextLine();
        }
    }
    //delete students
    //Not done yet

    private static void deleteStudent() {
        try {
            if (count == 0) {
                System.out.println("No students found!");
                return;
            }
            System.out.print("Enter Roll Number to delete: ");
            int rollNo = sc.nextInt();

            for (int i = 0; i < count; i++) {
                if (students[i].getRollNo() == rollNo) {
                    for (int j = i; j < count - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[count - 1] = null;
                    count--;
                    System.out.println("Student deleted successfully!");
                    return;
                }
            }
            System.out.println(" Student with Roll No " + rollNo + " not found!");
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid roll number");
            sc.nextLine();
        }
    }
}
