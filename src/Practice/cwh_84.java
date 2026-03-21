package Practice;

import java.util.Arrays;

public class cwh_84 {
    static void main() {
        int [] arr ={43,65,65,34,34,78};
        Arrays.sort(arr);

        int n = arr.length-1;
        int i=0,j=n;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }

}
