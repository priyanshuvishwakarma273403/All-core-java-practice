package DryPractice;

public class LargestSmallest {
    public static void main(String[] args) {
        int [] arr ={33,54,66,87,43,23};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>smax&&arr[i]!=max){
                smax=arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]<smin&&arr[i]!=min){
                smin=arr[i];
            }
        }
        System.out.println("The second maximum is "+smax);
        System.out.println("The second minimum is "+smin);

    }
}
