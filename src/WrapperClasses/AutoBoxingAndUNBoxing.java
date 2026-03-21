package WrapperClasses;

import java.util.ArrayList;

public class AutoBoxingAndUNBoxing {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;//autoboxing
        System.out.println("AutoBoxing :"+obj);

        Integer x = 20;
        int b = x; //unboxing
        System.out.println("AutoUnBoxing :"+b);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //autoboxing

        int value = list.get(0); //Unboxing
        System.out.println("Value from list :"+value);
    }
}
