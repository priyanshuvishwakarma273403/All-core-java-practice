package TaiyariDSA.binarySearch;

public class searching {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int tar= 6;
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > tar){
                 high = mid-1;
            }
            else if(arr[mid] < tar){
                low = mid+1;
            } else if (arr[mid] == tar) {
                System.out.println(arr[mid]);
                return;
            }

        }
        System.out.println("Element not found");
    }
}
