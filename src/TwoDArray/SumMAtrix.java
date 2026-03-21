package TwoDArray;

public class SumMAtrix {
    public static void main(String[] args) {
        int arr [][]={{34,43},{34,56}};
        int arr2 [][] = {{23,43},{44,32}};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j]+arr2[i][j];
            }
        }
        System.out.println(sum);
    }
}
