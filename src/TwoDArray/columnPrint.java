package TwoDArray;

public class columnPrint {
    public static void main(String[] args) {
        int [][] arr = {{34,56,43,54,78},{65,98,87,54,34},{12,67,87,34,56}};
        System.out.println("=====Column Print Matrix====");
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print("    "+arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
