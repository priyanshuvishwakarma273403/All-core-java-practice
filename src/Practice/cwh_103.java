package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class cwh_103 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int [] arr = {54,76,76,54,56};
        int [] arr2 ={54,64,32,76,65};
        int i =0,j=0;
        Arrays.sort(arr);
        Arrays.sort(arr2);
        while(i<arr.length&&j<arr2.length)
        {
            if(arr[i]==arr2[j])
            {
                list.add(arr[i]);
                i++;
                j++;
            }
            else if(arr[i]<arr2[j])
            {
                i++;
            }
            else {
                j++;
            }
        }
        for(int ele : list)
        {
            System.out.print(ele+" ");
        }
    }
}