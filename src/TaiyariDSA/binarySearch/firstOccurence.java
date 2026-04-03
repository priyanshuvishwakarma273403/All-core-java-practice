package TaiyariDSA.binarySearch;

public class firstOccurence {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int tar = 7;
        int low = 0 , high = arr.length -1 , idx = -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] > tar) high = mid-1;
            else if(arr[mid] < tar) low = mid+1;
            else{
                idx = mid;
                high = mid-1;
            }
        }
        System.out.println(idx);
    }
}
