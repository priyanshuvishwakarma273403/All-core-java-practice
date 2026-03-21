package GenericsPractice;

import java.util.Arrays;

public class SwapPractice {
    static<T> void swap (T[]arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Integer[] nums = {1, 2};
        String[] str = {"Hello", "World"};

       swap(nums, 0, 1);
       swap(str, 0, 1);

       for(int ele : nums){
           System.out.println(ele);
       }

       for(String ele : str){
           System.out.println(ele);
       }
    }
}
