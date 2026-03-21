package DryPractice;

import java.util.Arrays;

public class postiveAndNegative {
    public static void main(String[] args) {
        int [] arr  ={-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        int left = 0,right = arr.length-1;
        while(left<right) {
            if (left < right && arr[left] > 0) {
                left++;
            }
            while (right > left && arr[right] < 0) {
                right--;
                }
                if (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }
        System.out.println(Arrays.toString(arr));


//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(j>0&&arr[j]>0&&arr[j-1]<0){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
