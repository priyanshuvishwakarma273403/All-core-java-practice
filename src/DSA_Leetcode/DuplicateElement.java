package DSA_Leetcode;

//question
//Given an integer array nums, return
// true if any value appears at least twice in the
// array, and return false if every element is distinct.

public class DuplicateElement {
    public static void main(String[] args) {
        int []arr = {1,2,4,4};
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}
