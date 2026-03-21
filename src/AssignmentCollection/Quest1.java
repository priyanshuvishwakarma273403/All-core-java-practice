package AssignmentCollection;

import java.util.ArrayList;

public class Quest1 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("\nOriginal array list: " + c1);
        System.out.println("\nPrint using index of an element: ");

        int size =  c1.size();
        for (int i = 0; i < size; i++) {
            System.out.println(c1.get(i));
        }

    }
}
