package GenericsPractice;

import java.util.ArrayList;
import java.util.List;

interface Container<T>{
    void add(T element);
    T get(int index);
    int size();
    boolean isEmpty();
}

class ArrayContainer<T> implements Container<T>{
    private List<T> elements = new ArrayList<>();

    @Override
    public void add(T element) {
        elements.add(element);

    }

    @Override
    public T get(int index) {
        return elements.get(index);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public String toString() {
        return elements.toString();
    }
}

interface Measureable<T>{
    int compareTo(T other);
    boolean isGreaterThan(T other);
    boolean isLessThan(T other);
}

class Score implements Measureable<Score>{
    private int value;
    private String playerName;

    public Score(String playerName,int value) {
        this.playerName = playerName;
        this.value = value;
    }

    @Override
    public int compareTo(Score other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public boolean isGreaterThan(Score other) {
        return this.value > other.value;
    }

    @Override
    public boolean isLessThan(Score other) {
        return this.value < other.value;
    }

    @Override
    public String toString() {
        return playerName + ": " + value;
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
    System.out.println("=== Container Interface Demo ===");
    Container<String> stringContainer = new ArrayContainer<>();
    stringContainer.add("First");
    stringContainer.add("Second");
    stringContainer.add("Third");

        System.out.println("Container : "+ stringContainer);
        System.out.println("Size : "+ stringContainer.size());
        System.out.println("Element as 1 : "+ stringContainer.get(1));

        Container<Integer> intContainer = new ArrayContainer<>();
        intContainer.add(100);
        intContainer.add(200);
        System.out.println("\nInteger Container: " + intContainer);

        System.out.println("\n=== Measureable Interface Demo ===");
        Score score1 = new Score("Alice",150);
        Score score2 = new Score("Bob",250);
        Score score3 = new Score("Carl",150);

        System.out.println(score1 + " "+score2);
        System.out.println("Alice > Bob: " + score1.isGreaterThan(score2));
        System.out.println("Alice < Bob: " + score1.isLessThan(score2));
        System.out.println("Compare: " + score1.compareTo(score2));



    }
}
