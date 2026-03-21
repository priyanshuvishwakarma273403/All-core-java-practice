package DryPractice;


public class PeakElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        peakElement(arr);
    }
    public static void peakElement(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid+1]){
               high = mid;
            }
            else {
                low = mid+1;
            }
        }
        System.out.println(arr[low]);
    }
}
