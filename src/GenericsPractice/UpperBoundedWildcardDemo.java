package GenericsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcardDemo {
    public static double sumOfList(List<? extends Number> list){
        double sum =0;
        for(Number n:list){
            sum+=n.doubleValue();
        }
        return sum;
    }

    // Find average
    public static double average(List<? extends Number> list) {
        if (list.isEmpty()) return 0;
        return sumOfList(list) / list.size();
    }

    public static void printNumbers(List<? extends Number> list){
        for(Number n:list){
            System.out.println(n+" ");
        }
        System.out.println();
    }

    public static void copyToDoubleList(List<? extends Number> source , List<Double> dest){
        for(Number n:source){
            dest.add(n.doubleValue());
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        List<Double> doubles = Arrays.asList(1.5,2.5,3.5,4.5);
        List<Float> floats = Arrays.asList(1.5f,2.5f,3.5f,4.5f);

        System.out.println("=== Upper Bounded Wildcard (? extends Number) ===\n");

        printNumbers(integers);
        System.out.println("Sum : "+ sumOfList(integers));
        System.out.println("Average : "+ average(integers));
        System.out.println();

        printNumbers(doubles);
        System.out.println("Sum:  "+ sumOfList(doubles));
        System.out.println("Average : "+ average(doubles));
        System.out.println();

        printNumbers(floats);
        System.out.println("Sum:  "+ sumOfList(floats));
        System.out.println("Average : "+ average(floats));

        System.out.println("\nCopy Demo");
        List<Double> allDoubles = new ArrayList<>();
        copyToDoubleList(integers, allDoubles);
        copyToDoubleList(doubles, allDoubles);
        copyToDoubleList(floats, allDoubles);
        System.out.println("All as doubles : "+ allDoubles);

    }
}
