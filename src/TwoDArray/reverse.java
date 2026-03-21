package TwoDArray;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int [][]arr={{43,54,65},{54,56,87},{64,78,64},{43,67,78},{76,54,23}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length-1;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
