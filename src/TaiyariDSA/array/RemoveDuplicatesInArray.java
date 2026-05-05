package TaiyariDSA.array;

import java.util.HashSet;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        System.out.println(set);
    }
}
