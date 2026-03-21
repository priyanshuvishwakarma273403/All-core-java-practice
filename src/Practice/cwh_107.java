package Practice;

import java.util.ArrayList;
import java.util.Arrays;
//first and last occurance
public class cwh_107 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9};
        Arrays.sort(arr1);
        int target = 5;
        int low = 0, high = arr1.length - 1, indx = -1,indx2 =-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr1[mid] < target) {
                low = mid + 1;
            } else if (arr1[mid] > target) {
                high = mid - 1;
            } else if (arr1[mid] == target) {
                indx = mid;
                high = mid - 1;

            }
        }
      low = 0; high = arr1.length - 1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (arr1[mid] < target) {
                low = mid + 1;
            } else if (arr1[mid] > target) {
                high = mid - 1;
            } else   {
                indx2 = mid;
               low = mid + 1;
            }
        }
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
        System.out.println();

        System.out.print(indx+" ");
        System.out.print(indx2+" ");
        }

    }

