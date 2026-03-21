package TwoDArray;

public class MatrixRow {
    public static void main(String[] args) {
        int [] [] arr ={{5,6,4,3},{5,7,8,9},{3,2,3,1},{6,3,9,4}};
        int m = arr.length;
        int n = arr[0].length;
        print(arr);
        int maxsum=Integer.MIN_VALUE;
        int maxrow =-1;
        for(int i=0;i<m;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=arr[i][j];
            }
            if(sum>maxsum)
            {
                maxsum=sum;
                maxrow=i;
            }
        }
       // System.out.println("maxsum is "+maxrow);
    }

    public  static void printcolwise(int[][] arr) {
        int m =arr.length;
        int n=arr[0].length;
        for(int j=0;j<n;j++){ //col
            for(int i=0;i<m;i++){ //row
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void print(int[][] arr) {
        int m =arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

}
