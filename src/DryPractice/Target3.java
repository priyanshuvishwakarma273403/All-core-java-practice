package DryPractice;

import java.util.Scanner;

public class Target3 {
    public static void main(String[] args) {
        int [] arr ={3,4,3,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target Number : ");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                for(int k =j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        flag = true;
                        break;
                    }
                }
            }
        }
        if(!flag){
            System.out.println("Target Not Found");
        }
    }
}
