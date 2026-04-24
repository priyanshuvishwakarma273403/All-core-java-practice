package TaiyariDSA.binarySearch;


public class PeakElement1 {
    public static void main(String[] args) {
        int [] nums = {1,40,100,90, 4};
        System.out.println(findPeak(nums));
    }

//    time complexity O(log n)
//        space O(1)

    private static int findPeak(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid =   (low +high)/2;
            if(nums[mid]  > nums[mid+1]){
                high = mid;
            } else{
                low = mid+1;
            }
        }
        return low;
    }
}
