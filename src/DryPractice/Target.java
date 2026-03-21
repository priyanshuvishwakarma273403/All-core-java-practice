package DryPractice;

import java.util.Scanner;

public class Target {
    public static void main(String[] args) {
        int [] arr ={4,3,4,5,6,7};
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
      int target = sc.nextInt();
      boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("No element sum found whose match the target");
        }
       }

      }

