package com.ArrayQuestion;

public class Quest4 {
    static void main() {
        int [] arr ={3,5,34,4,65,76,2,6};
        int n = arr.length;
        int a =0 ,b =0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]%2==0)
           a++;
            else
           b++;
        }
        System.out.println("The even number is :"+a );
        System.out.println("The odd number is:"+b);



    }

}
