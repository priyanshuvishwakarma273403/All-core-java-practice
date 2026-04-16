package TaiyariDSA.hashMapPractice;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {0, -1, 2, -3, 1};
        int target = 2;
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr){
            int rem = target - ele;
            if(set.contains(rem)){
                System.out.println("Found it!");
                return;
            }
            set.add(ele);
        }
        System.out.println("Not Found it!");
    }
}
