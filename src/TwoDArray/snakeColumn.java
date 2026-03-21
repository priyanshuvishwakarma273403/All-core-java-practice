package TwoDArray;
//snake column printing
public class snakeColumn {
    public static void main(String[] args) {
        int [][]arr={{43,54,65},{54,56,87},{64,78,64}};
          for(int k=0;k<arr.length;k++) {
              if (k % 2 == 0) {
                  for (int j = 0; j < arr[0].length; j++) {
                      System.out.print(arr[j][k] + " ");
                  }
              }
              else {
                  for(int j =arr[0].length-1;j>=0;j--) {
                      System.out.print(arr[j][k] + " ");
                  }
          }
              System.out.println();

      }
//      for(int k=0;k<arr.length;k++){
//          for(int j=0;j<arr[0].length;j++){
//              System.out.print(arr[k][j]+" ");
//          }
//          System.out.println();
      }


        }


