package TaiyariDSA.array;

public class MAxSubArray {
    public static void main(String[] args) {
        int [] arr  = {-2, 3, -1, 2};
        System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] arr) {
        int curr_sum = 0;
        int max_sum = arr[0];

        for(int i = 0; i < arr.length; i++){
            curr_sum += arr[i];

            if(curr_sum > max_sum){
                max_sum = curr_sum;
            }

            if(curr_sum < 0){
                curr_sum = 0;
            }
        }
        return max_sum;
    }
}
