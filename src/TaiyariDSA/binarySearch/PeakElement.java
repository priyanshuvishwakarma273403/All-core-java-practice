package TaiyariDSA.binarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 5, 7, 8, 1};
        int low = 1 , high = arr.length-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid + 1;
            else high = mid - 1;
        }
    }
}
