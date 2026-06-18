package TaiyariDSA.basicSorting;

public class SortColors {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        sortColor(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

    public static void sortColor(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
