package DryPractice;

public class PositiveNumberAverage {
    public static void main(String[] args) {
        int arr[] = {-1, -2, 5, 6, -5, -7, 0, 6, -4};
        int sum = 0;
        int count = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>0)
            {
                sum=sum+arr[i];
                count++;
            }
        }
        if(count>0)
        {
            double average = (double)sum/count;
            System.out.println(average);
        }
        else{
            System.out.println("Array have no element is positive ");
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
