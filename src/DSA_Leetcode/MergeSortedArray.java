package DSA_Leetcode;

import java.util.Arrays;
// the question is
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
// representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but
// be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
// where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//Example 1:
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
public class MergeSortedArray {

    public static void merge(int[] arr1, int firstarr, int[] arr2, int secondarr) {
        int i=firstarr-1 , j=secondarr-1,k = firstarr+secondarr-1;
        while(j>=0)
        {
           // arr1[k--]=(i>=0 &&arr1[i]>arr2[j]) ?arr1[i--]:arr2[j--];
            if(i>=0 && arr1[i]>arr2[j])
            {
                arr1[k]=arr1[i];
                i--;
            }
            else{
                arr1[k]=arr2[j];
                j--;
            }
            k--;
       }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        int firstarr =3;
        int secondarr = 3;
        merge(arr1,firstarr ,arr2,secondarr);
        System.out.println(Arrays.toString(arr1));
    }
}
