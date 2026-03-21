package DryPractice;

public class MaximumsubArray {
    public static void main(String[] args) {
        int [] arr ={1, 2, 3, 4, 5, 6};
        int k=3;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<k;i++)
        {
           sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i]-arr[i-k];
            max= Math.max(max,sum);
        }
        System.out.println("Maximum Sub Array is : "+max);
    }
}
