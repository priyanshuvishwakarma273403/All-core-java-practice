package Practice;

import java.util.Scanner;

//Find All Pairs with Given Sum – Return indices or values.
public class cwh_109 {
    public static void main(String[] args) {
        int arr [] = {3,4,5,6,7,2,3};
        Scanner sc = new Scanner(System.in);
        int target= sc.nextInt();
      boolean flag=false;
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]+arr[j]==target){
                  System.out.println(arr[i]+" "+arr[j]);
                  flag=true;
              }
          }
          if(!flag){
              System.out.println("the number is not available in the array");
          }
      }
    }
}
