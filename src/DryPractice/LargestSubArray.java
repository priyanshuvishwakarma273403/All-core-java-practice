package DryPractice;

public class LargestSubArray {
    public static void main(String[] args) {
        int arr [] = {2,4,5,6,7,8,3,4,6,5,7,3};
        int k =4;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max = sum;
        for(int i=k;i< arr.length;i++){
            sum+=arr[i]-arr[i-k];
            max= Math.max(max,sum);
        }
        System.out.println(k+" "+max);
    }
}
