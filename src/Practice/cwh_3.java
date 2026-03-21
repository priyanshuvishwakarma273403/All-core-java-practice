package Practice;

import java.util.Scanner;

public class cwh_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=0;
        int [] arr ={10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                arr[i]*=2;
            }
            else if(i%2==0) {
                arr[i]+=10;
            }
            System.out.println(arr[i]);

        }

    }
}
