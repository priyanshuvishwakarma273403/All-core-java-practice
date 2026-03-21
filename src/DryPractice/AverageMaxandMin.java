package DryPractice;

public class AverageMaxandMin {
    public static void main(String[] args) {
        int [] arr = {4,5,6,3,2};
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
            else if (arr[i]<min){
                min = arr[i];
            }
        }
        double average =((sum-max-min))/(arr.length-2);
        System.out.println(average);
        System.out.println(sum);
    }
}
