package Binary;

public class PeakMountain {
    public static void main(String[] args) {
        int arr [] = {3,4,5,6,7,8,10,6};
        int low =0; int high =arr.length-1; int index=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
              index=mid;
             high=mid-1;
            }
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println(index);
    }
}
