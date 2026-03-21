package LambdaExpressionPractice;

import java.util.ArrayList;
import java.util.stream.Collector;

class CustomCollectors {
    // Custom collector to create a comma-separated string with "and" before last element
    public static Collector<Object, ArrayList<Object>, Object> toEnglishList() {
        return Collector.of(
                ArrayList::new,  // Supplier
                ArrayList::add,  // Accumulator
                (list1, list2) -> {  // Combiner
                    list1.addAll(list2);
                    return list1;
                },
                list -> {  // Finisher
                    if (list.isEmpty()) return "";
                    if (list.size() == 1) return list.get(0);
                    if (list.size() == 2) return list.get(0) + " and " + list.get(1);
                    String last = list.get(list.size() - 1).toString();
                    String others = String.join((CharSequence) ", ", (CharSequence) list.subList(0, list.size() - 1));
                    return others + ", and " + last;
                }
        );
    }
    // Custom collector to calculate product
    public static Collector<Integer, ?, Integer> toProduct() {
        return Collector.of(
                () -> new int[]{1},  // Supplier - array with initial value 1
                (acc, value) -> acc[0] *= value,  // Accumulator
                (acc1, acc2) -> {  // Combiner
                    acc1[0] *= acc2[0];
                    return acc1;
                },
                acc -> acc[0]  // Finisher
        );
    }
}

public class CustomCollectorExample {
    public static void main(String[] args) {

    }
}
