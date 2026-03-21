package TwoDArray;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int [] [] arr ={{3,4,5},{5,6,8},{4,6,3}};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }

        }
        System.out.println("transpose of matrix is:");
        for(int [] ele : arr){
            for(int elei:ele){
                System.out.print(elei+" ");
            }
            System.out.println();
        }
    }
}
