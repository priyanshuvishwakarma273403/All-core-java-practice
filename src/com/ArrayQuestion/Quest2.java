package com.ArrayQuestion;

public class Quest2 {
    static void main() {
        int [] arr = {10,20,30,65,43,75,1,54,76,40};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
      for(int i =0;i<n;i++)
      {
          if(arr[i]>max)
          max=arr[i];
      }
        System.out.println("The maximum number is:"+max);
        System.out.println();
        int min = Integer.MAX_VALUE;
        for(int i =0;i<n;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("The minimum number is:"+min);
    }
}
