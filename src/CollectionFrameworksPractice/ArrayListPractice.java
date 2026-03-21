package CollectionFrameworksPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    private String name;
    private double gpa;

    public ArrayListPractice(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        List<ArrayListPractice> list = new ArrayList<>();
        list.add(new ArrayListPractice("Priyanshu",9.5));
        list.add(new ArrayListPractice("mohanjodhro",5.5));
        list.add(new ArrayListPractice("alice",6.5));

        for (ArrayListPractice listPractice : list) {
            System.out.println(listPractice.getName()+" "+listPractice.getGpa());
        }
    }


}
