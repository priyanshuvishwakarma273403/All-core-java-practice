package DryPractice;


import java.util.Scanner;

public class InsertSpecific {
    public static void main(String[] args) {
        int arr [] = {43,65,76,87,53,65};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index:");
        int n = sc.nextInt();
        System.out.println("Enter Value:");
        int m = sc.nextInt();
        int [] newArr = new int[arr.length+1];
        for(int i=0,j=0;i<newArr.length;i++){
            if(i==n)
            {
                newArr[i]=m;
           }
            else {
                newArr[i]=arr[j];
                j++;
            }
        }
        for(int ele : newArr){
            System.out.print(ele+" ");
        }
    }
}
