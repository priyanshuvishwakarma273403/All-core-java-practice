package CollectionQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Set<String> set = new HashSet<>(list);
        set.forEach(System.out::println);

    }
}
