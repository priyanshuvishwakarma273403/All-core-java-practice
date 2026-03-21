package Practice;

import java.util.Arrays;

public class cwh_90 {
    public static void main(String[] args) {
        int [][] arr = {{32,43,56},{54,43,76},{87,75,34}};
        int [][] destination = new int [arr.length][];
        for(int i=0;i<arr.length;i++)
        {
            destination[i]=new int [arr[i].length];
            System.arraycopy(arr[i],0,destination[i],0,arr[i].length);
        }
        System.out.println(Arrays.deepToString(destination));
//        for(int i=0;i<arr.length;i++)
//            {
//            destination[i]= new int[arr[i].length];
//                for(int j =0;j<arr.length;j++)
//                {
//                    destination[i][j] = arr[i][j];
//                }
//            }
//        System.out.println(Arrays.deepToString(destination));

    }
}
