package TaiyariDSA.binarySearch;

//Given a sorted array arr[] of n positive integers having all the
//numbers occurring exactly twice, except for one number which will occur only once.
//Find the number occurring only once.
//Examples :
//Input: n = 5, arr[] = {1, 1, 2, 5, 5}
//Output: 2
//Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.

public class SingleAmountDoubles {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,5,5};
        int  n = arr.length;
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        if(arr[0]!=arr[1]){
            System.out.println(arr[0]);
            return;
        }
        if(arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1]);
            return;
        }
        int low = 0 , high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                System.out.println(arr[mid]);
                return;
            }
            int f = mid, s = mid;
            if(arr[mid-1] == arr[mid]){
                f = mid -1;
            } else {
                s = mid+1;
            }
            int leftCount =  f -low;
            int rightCount = high - s;
            if(leftCount % 2 == 0){
                low = s +1;
            }
            else{
                high = f -1;
            }
        }
    }
}
