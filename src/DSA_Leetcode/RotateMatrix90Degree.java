package DSA_Leetcode;

import java.util.Arrays;

public class RotateMatrix90Degree {
        public static void main(String[] args) {
            int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
            int n = matrix.length;
            rotate(matrix,n);
            System.out.println(Arrays.deepToString(matrix));


        }
        private  static void rotate(int[][] matrix,int n) {
            // Step 1: Transpose the matrix
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // Step 2: Reverse each row
            for (int i = 0; i < n; i++) {
                for (int j = 0, k = n - 1; j < k; j++, k--) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][k];
                    matrix[i][k] = temp;
                }
            }
        }
    }

//    public static void main(String[] args) {
//        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int n = arr.length;
//        rotate(arr,n);
//        System.out.println(Arrays.deepToString(arr));
//
//
//    }
//
//    private static void rotate(int[][] arr, int n) {
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                int temp=arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0,k=n-1;j<k;j++,k--){
//                int temp = arr[i][j];
//                arr[i][j]=arr[i][k];
//                arr[i][k]=temp;
//            }
//        }
//    }
//}
