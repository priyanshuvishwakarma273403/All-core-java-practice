package TcsInterview;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,6,7,8,4,6};
       HashSet<Integer> set = new HashSet<Integer>();
       for(int ele : arr){
           set.add(ele);
       }
        System.out.println(set);
    }
}
