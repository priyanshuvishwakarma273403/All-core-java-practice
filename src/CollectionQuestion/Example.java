package CollectionQuestion;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Student> pq = new PriorityQueue<Student>(5, new StudentComparator());
        Student s = new Student("Priyanshu",8.0);
        pq.add(s);
        Student s1 = new Student("Vaibhav",4.0);
        pq.add(s1);
        Student s2 = new Student("Mishra",6.0);
        pq.add(s2);
        System.out.println("Students served in their priority order");
        while (!pq.isEmpty()){
            System.out.println(pq.poll().getName());
        }


    }
}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.cgpa < o2.cgpa){
            return 1;
        }
        else if(o1.cgpa> o2.cgpa){
            return -1;

        }
        return 0;
    }
}

class Student{
    public String name;
    public double cgpa;
    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }
}
