package CollectionFrameworksPractice;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id + " " + this.name;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Initial: "+list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,10);
        System.out.println("After added "+list);

        System.out.println(list.get(2));

        list.remove(Integer.valueOf(10));
        System.out.println(list);

        System.out.println(list.contains(1));

       for(int i = 0; i< list.size(); i++){
           System.out.println(list.get(i));
       }

       for(Integer i: list){
           System.out.print(i +" ");
       }
        System.out.println();

        Iterator<Integer> it = list.iterator();
       while(it.hasNext()){
           System.out.print(it.next());
       }

        System.out.println();

       list.forEach(System.out::print);
        System.out.println();

        int index = Collections.binarySearch(list,5);
        System.out.println("Binary search index of 4 : "+index);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Rahul"));
        students.add(new Student(2, "Aman"));
        students.add(new Student(3, "Neha"));
        students.forEach(System.out::print);

        // 1️⃣7️⃣ Sort Custom Object
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("Sorted Students:");
        students.forEach(System.out::println);

        CopyOnWriteArrayList<Integer> safeList = new CopyOnWriteArrayList<>();
        safeList.add(1);
        safeList.add(2);
        for (Integer i : safeList) {
            safeList.add(3); // no exception
        }
//
        System.out.println("Fail-safe list: " + safeList);
//
        list.clear();
        System.out.println("After clear: " + list);
//


    }
}
