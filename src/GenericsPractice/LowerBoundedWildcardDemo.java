package GenericsPractice;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class LowerBoundedWildcardDemo {
    public static void addInteger(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

    }

    public static void addNumbers(List <? super Number> list, Number... numbers){
        for(Number number : numbers){
            list.add(number);
        }
    }

    public static <T> void fill(List<? super T> list , T elements , int count){
        for(int i =0; i<count;i++){
            list.add(elements);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Lower Bounded Wildcard (? super Integer) ===\n");

        List<Integer> list = new ArrayList<>();
        addInteger(list);
        System.out.println("List<Integer>: " +list);

        List<Number> numbers = new ArrayList<>();
        addInteger(numbers);
        System.out.println("List<Number>: " +numbers);

        // Works with List<Object>
        List<Object> objList = new ArrayList<>();
        addInteger(objList);
        System.out.println("List<Object>: " + objList);

        System.out.println("\n=== addNumbers Demo ===");
        List<Object> mixedList = new ArrayList<>();
        addNumbers(mixedList,10,20.5,30.0f);
        System.out.println("Mixed Number "+ mixedList);

        System.out.println("\n=== fill Demo ===");
        List<Number> filledList = new ArrayList<>();
        fill(filledList, 42, 5);
        System.out.println("Filled list: " + filledList);
    }
}
