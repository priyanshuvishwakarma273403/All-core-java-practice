package DryPractice;

import java.util.Arrays;

public class DuplicateElement2 {
    public static void main(String[] args) {
        int arr [] ={34,43,43,42,53,34,32};
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
