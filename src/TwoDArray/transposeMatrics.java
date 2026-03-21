package TwoDArray;


import java.util.Arrays;

public class transposeMatrics {
    public static void main(String[] args) {
        int [][] arr ={{2,4,5,5},{4,6,3,4},{5,6,7,8},{3,4,6,7}};
        print(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);
    }

    private static void print(int[][] arr) {
        for(int []ele :arr)
        {
           for(int a :ele)
           {
               System.out.print(a+" ");
           }
            System.out.println();
        }
        System.out.println();
    }
}
