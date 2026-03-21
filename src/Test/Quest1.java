package Test;

 class Employee {
     private static int idCounter = 1;
     private int id;
     private String name;
     private String position;
     private double salary;

     public Employee(int id, String name, String position, double salary) {
         this.id = idCounter++;
         this.name = name;
         this.position = position;
         this.salary = salary;
     }

     public double getCalculateSalary() {
         double hra = 0.20 * salary;
         double da = 0.10 * salary;
         return salary + hra + da;


     }

     public void display() {
         System.out.println("Employee ID: " + id);
         System.out.println("Name: " + name);
         System.out.println("Position: " + position);
         System.out.println("Salary: " + salary);
         System.out.println("total salary: " + salary);
         System.out.println("-------------------------");
     }
 }

public class Quest1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Priyanshu", "JavaDeveloper", 1500);
        Employee e2 = new Employee(2,"Priyanshu", "JavaDeveloper", 1500);
        Employee e3 = new Employee(3,"Priyanshu", "JavaDeveloper", 1500);
        e1.display();
        e2.display();
        e3.display();
    }
}
