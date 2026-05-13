package codewithprayutosh.twoPointer;

import java.util.Arrays;

public class DuplicateArray {

    public static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        while(j< arr.length){
            if(arr[i] == arr[j]){
                return arr[i];
            }
            i++;
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
