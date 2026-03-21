package CollectionQuestion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};

        Set<Integer> set = new LinkedHashSet<>();
        for(int i : arr){
            set.add(i);

        }
        System.out.print(set);
    }
}
