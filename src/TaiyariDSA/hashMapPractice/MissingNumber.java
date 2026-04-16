package TaiyariDSA.hashMapPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {10, 12, 11, 15};
        int low = 10, high = 15;
        ArrayList<Integer> ans = new ArrayList<>(arr.length);
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        for(int i = low; i<= high; i++){
            if(!set.contains(i)) ans.add(i);
        }
        System.out.println(ans);
    }
}
