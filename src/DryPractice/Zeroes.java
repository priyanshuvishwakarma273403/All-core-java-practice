package DryPractice;

import java.util.Arrays;

public class Zeroes {
    public static void main(String[] args) {
        int [] arr ={0,5,0,5,3,2,6,3};
       Arrays.sort(arr);
        int count =0;
        for(int ele : arr){
          if(ele ==0)
          {
              count++;
          }
        }
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
            arr[i]=0;
        }
//        for(int ele : arr)
//        {
//            System.out.print(ele+" ");
//        }
        int i=0,j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }


           }
        }

