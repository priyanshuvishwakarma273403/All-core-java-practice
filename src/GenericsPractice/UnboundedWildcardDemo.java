package GenericsPractice;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardDemo {
    public static void printList(List<?> list){
        System.out.println("List contents: ");
        for(Object o : list){
            System.out.println(o+" ");
        }
        System.out.println();
    }

    public static int getListSize(List<?> list){
        return list.size();
    }

    public static  boolean isListEmpty(List<?> list){
        return list.isEmpty();
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello","World","Java");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("=== Unbounded Wildcard Demo ===\n");

        printList(strings);
        printList(integers);
        printList(doubles);

        System.out.println("\n=== List Sizes ===");
        System.out.println("String size "+getListSize(strings));
        System.out.println("Integer size "+getListSize(integers));
        System.out.println("Double size "+getListSize(doubles));
    }
}
