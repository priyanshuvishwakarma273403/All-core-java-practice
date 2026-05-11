package TcsInterview;

import java.util.Scanner;

public class FindIntersectionOfTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] a = new int[n1];
        for(int i=0;i<n1;i++) a[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int [] b = new int[n1];
        for(int i=0;i<n2;i++) b[i] = sc.nextInt();

        for(int i = 0 ; i< n1; i++){
            for(int j = 0 ; j < n2; j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
//        int [] arr1 = {1,2,6,8,3};
//        int [] arr2 = {1,2,12,6,66,78};

//        for(int i = 0; i < arr1.length; i++){
//            for(int j = 0; j < arr2.length; j++){
//                if(arr1[i] == arr2[j]){
//                    System.out.print(arr1[i] + " ");
//                    break;
//                }
//            }
//        }
    }
}
