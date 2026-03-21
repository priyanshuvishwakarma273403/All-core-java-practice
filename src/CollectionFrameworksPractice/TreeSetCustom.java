package CollectionFrameworksPractice;

import java.util.Comparator;
import java.util.TreeSet;

class Students implements Comparable<Students>{
    String name;
    int marks;
    public Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Students other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + " " + marks;
    }
}

public class TreeSetCustom {
    public static void main(String[] args) {
        TreeSet<Students> students = new TreeSet<>();
        students.add(new Students("Alice", 85));
        students.add(new Students("Bob", 92));
        students.add(new Students("Charlie", 78));
        students.add(new Students("David", 95));

        System.out.println("Students by marks: " + students);

        TreeSet<Students> byName = new TreeSet<>(
                Comparator.comparing(s->s.name)
        );
        byName.addAll(students);
        System.out.println("Students by name: " + byName);

        TreeSet<Students> multiSort = new TreeSet<>(
                Comparator.comparing((Students s) -> s.marks)
                        .thenComparing(s->s.name)
        );
        multiSort.addAll(students);
        multiSort.add(new Students("Eve", 85)); // Same marks as Alice
        System.out.println("Students by marks, then name: " + multiSort);

    }
}
