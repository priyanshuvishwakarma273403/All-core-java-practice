package TcsInterview;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(!set.add(ele)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
