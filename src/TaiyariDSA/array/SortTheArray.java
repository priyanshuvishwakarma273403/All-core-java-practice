package TaiyariDSA.array;

public class SortTheArray {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1};
        sortColors(nums);
    }

    private static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp = 0;
        while(mid<=high){
            if(nums[mid] == 0){
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            }else{
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        for(int ele : nums){
            System.out.print(ele + " ");
        }
    }
}

//     time complexity O(n)
//    space O(1)
