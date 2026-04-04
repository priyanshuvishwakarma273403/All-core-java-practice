package TaiyariDSA.binarySearch;

//Input: arr[] = [1, 3, 4, 5, 7] and k = 2
//Output: 6
//Explanation: k = 2, Missing numbers are 2 and 6. So 2nd missing number is 6.

public class KthMissingElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7};
        int k = 2;
        int low  = 0, high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            int correctNo = mid+1;
            int missing = arr[mid] - correctNo;
            if(missing >= k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(high+1+k);

    }
}
