package TaiyariDSA.binarySearch;

import java.util.ArrayList;

public class FirstAndLastOccurences {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int tar = 5;
        ArrayList<Integer> ans = new ArrayList<>();

        int low = 0, high = arr.length-1 , idx = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] < tar){
                low = mid+1;
            }else if(arr[mid] > tar){
                high = mid-1;
            }else{
                idx = mid;
                high = mid-1;
            }
        }
        ans.add(idx);

        low = 0;
        high = arr.length-1;
        idx = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] < tar){
                low = mid+1;
            } else if(arr[mid] > tar){
                high = mid-1;
            }else{
                idx = mid;
                low = mid+1;
            }
        }
        ans.add(idx);

        System.out.println(ans);
    }
}
