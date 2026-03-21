package CollectionFrameworksPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> fruits =  new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        fruits.add(1,"Grapes");
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("All fruits: " + fruits);

        System.out.println("Size : " + fruits.size());

        System.out.println("Contain Mango : "+fruits.contains("Mango"));

        fruits.remove("Banana");
        fruits.remove(0);

        for(String fruit : fruits){
            System.out.print(fruit+" ");
        }

        Collections.sort(fruits);
        System.out.println("\nSorted : "+fruits);

        fruits.clear();
        System.out.println("Is Empty : "+ fruits.isEmpty());



    }
}
