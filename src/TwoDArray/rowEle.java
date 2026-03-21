package TwoDArray;

import java.util.Arrays;

public class rowEle {
    public static void main(String[] args) {
        int [][] arr ={{34,56,78},{65,98,34},{12,34,56}};
        int max =0;
        for(int i=0;i<arr.length;i++)
        {
             max =Integer.MIN_VALUE;
            for(int j=0;j<arr[0].length;j++)
            {
              if(max<arr[i][j])
              {
                  max=arr[i][j];
              }
            }
        }
        System.out.println(max);

    }
}
