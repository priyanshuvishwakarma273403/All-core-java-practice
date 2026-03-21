package DryPractice;

public class SmallestSubArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,4,3,2,3,4,6,3};
        int k=4;
        int min = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
       min=sum;
        for(int i=k;i< arr.length;i++){
            sum+=arr[i]-arr[i-k];
            min=Math.max(min,sum);
        }
        System.out.println(k+" "+min);
    }
}
