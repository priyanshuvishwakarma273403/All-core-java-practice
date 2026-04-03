package TaiyariDSA.binarySearch;

public class FloorInArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 8, 10, 10, 12, 19};
        int tar =  3;
        int low = 0 , high = arr.length -1 , idx = -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] > tar) high = mid-1;
            else{
                idx = mid;
                low = mid+1;
            }
        }
        System.out.println(idx);
    }
}
