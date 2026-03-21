package AssignmentCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        if(s1.age == s2.age){
            return 0;
        }
        else if(s1.age > s2.age){
            return 1;
        } else{
            return -1;
        }
    }
}

public class Ques11 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student(101,"Vijay",23));
        list.add(new Student(106,"Ajay",27));
        list.add(new Student(105,"Jai",21));

        System.out.println("Sorting by Name");

        Collections.sort(list,new AgeComparator());
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Student st = (Student) itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by age");

        Collections.sort(list,new AgeComparator());
        Iterator itr2=list.iterator();
        while(itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
