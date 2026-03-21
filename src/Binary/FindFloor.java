package Binary;

public class FindFloor {
    public static void main(String[] args) {
        int [] arr = {1,2,8,10,10,12,19};
        int target = 5;
        int low =0 ;
        int high = arr.length-1;
        int ind = -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid]>target)
            {
                high =  mid-1;
            }
            else {
                ind = mid;
                low = mid+1;
            }
        }
        System.out.println(ind);
    }
}
