package AssignmentCollection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollno ;
    String name;
    int age ;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        if(age==st.age){
            return 0;
        }
        else if(age<st.age){
            return 1;
        } else{
            return -1;
        }
    }
}

public class Quest9 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101,"Vijay" ,13));
        list.add(new Student(102,"Julian",43));
        list.add(new Student(103,"Julian",23));

        Collections.sort(list);
        for(Student s: list){
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }
    }
}
