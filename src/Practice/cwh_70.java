package Practice;

import java.util.Arrays;

public class cwh_70 {
    static void main(String[] args) {
        int [] arr ={2,1,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                num++;
            }
        }
        System.out.println("Number of even numbers is: "+num);
        System.out.println("Number of odd numbers is: "+(arr.length-num));
       }
    }