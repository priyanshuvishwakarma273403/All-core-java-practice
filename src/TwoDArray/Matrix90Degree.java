package TwoDArray;

public class Matrix90Degree {
    public static void main(String[] args) {
        int arr [][] = {{5,6,4,3},{5,7,8,9},{3,2,3,1},{6,3,9,4}};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int col = 0; col < n; col++){
            int i =0 , j = n-1;
                    while(i<j){
                        int temp = arr[i][col];
                        arr[i][col] = arr[j][col];
                        arr[j][col] = temp;
                        i++;
                        j--;
                     }
                    for(int[] ele : arr){
                        for(int elei : ele){
                            System.out.print(elei + " ");
                        }
                        System.out.println();
                    }
            System.out.println();
        }
    }
}
