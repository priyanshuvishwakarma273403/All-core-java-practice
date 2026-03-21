package CollectionFrameworksPractice;

import java.util.*;

public class ArrayListPractice3 implements Comparable<ArrayListPractice3> {
    private String name;
    private double gpa;

    public ArrayListPractice3(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean eqauls(Object obj) {
        if(this==obj) return true;
        if(obj == null || getClass() !=obj.getClass())  return false;
        ArrayListPractice3 obj2 = (ArrayListPractice3)obj;
        return Double.compare(gpa , obj2.gpa) == 0 && Objects.equals(name, obj2.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    public String toString() {
        return  "ArrayListPractice3{" + "name=" + name + ", gpa=" + gpa +'}';
    }

    public int compareTo(ArrayListPractice3 obj) {
        return Double.compare(obj.gpa, this.gpa);
    }

    public static void main(String[] args) {
        List<ArrayListPractice3> list = new ArrayList<>();
        list.add(new ArrayListPractice3("Ankit",1.0));
        list.add(new ArrayListPractice3("Abhishek",2.0));
        list.add(new ArrayListPractice3("Aashu",3.0));
        list.add(new ArrayListPractice3("Faiz",4.0));

        Comparator<ArrayListPractice3> comparator = Comparator.comparing(ArrayListPractice3::getGpa).reversed().thenComparing(ArrayListPractice3::getName);
        list.sort((o1, o2) -> {
            if(o1.gpa == o2.gpa) return 0;
            else if(o1.gpa < o2.gpa) return -1;
            else return o2.getName().compareTo(o1.getName());
        });
        for(ArrayListPractice3 obj : list) {
            System.out.println(obj.getName()+" "+obj.gpa);
        }
        Collections.sort(list,comparator);

        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.contains(5));
        System.out.println(list.contains(50));
        list.remove(2);
    }
}
