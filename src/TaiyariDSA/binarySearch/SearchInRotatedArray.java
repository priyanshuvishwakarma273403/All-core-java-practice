package TaiyariDSA.binarySearch;
//
//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly left rotated at
//an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k],
//nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
//For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target,
//return the index of target if it is in nums, or -1 if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int tar = 0;
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == tar){
                System.out.println(mid);
                return;
            } else if(arr[low] <=  arr[mid]){
                if(arr[low] <= tar && tar < arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[high] <= tar && tar < arr[mid]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        System.out.println(-1);

    }
}
