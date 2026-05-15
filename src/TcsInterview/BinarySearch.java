package TcsInterview;

public class BinarySearch {
    public static int search (int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == tar) {
                return mid;
            }else if(arr[mid] < tar) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {-1,0,3,5,9,12};
        int tar = 9;

        System.out.println(search(arr, tar));
    }
}
