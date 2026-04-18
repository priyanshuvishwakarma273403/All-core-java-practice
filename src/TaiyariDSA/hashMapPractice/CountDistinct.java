package TaiyariDSA.hashMapPractice;

import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        int [] arr = {2, 2};
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        System.out.println(set.size());
    }
}
