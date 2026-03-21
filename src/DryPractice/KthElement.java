package DryPractice;

import java.util.Scanner;

public class KthElement {
    public static void main(String[] args) {
        int arr [] ={2,4,5,6,4,5,7,5};
        Scanner sc = new Scanner(System.in);
        int Kth = 4;
       for(int ele : arr){
          if(ele<Kth){
              System.out.println(ele+" ");
          }
       }
    }
}
