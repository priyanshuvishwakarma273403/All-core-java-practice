package Practice;

import java.util.Arrays;

public class cwh_106 {
    public static void main(String[] args) {
        int arr [] ={3,4,5,6,2,3,4,5,7,8,6,5,4,3,5,6,7,8};
        Arrays.sort(arr);
        int target =8;
        int low =0,high=arr.length-1,indx=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else {
                indx=mid;
                high=mid-1;
            }
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(indx);
    }
}
