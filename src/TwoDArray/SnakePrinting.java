package TwoDArray;

public class SnakePrinting {
    public static void main(String[] args) {
        int [] [] arr ={{34,56,78},{65,98,34},{12,34,56},{32,44,56}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int j = arr[0].length-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
