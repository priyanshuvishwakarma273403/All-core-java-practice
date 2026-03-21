package TwoDArray;

public class AllRowReverse {
    public static void main(String[] args) {
        int[][] arr = {{43, 54, 65}, {54, 56, 87}, {64, 78, 64}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[0].length-1; j>= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
