package TwoDArray;

public class Snake {
    public static void main(String[] args) {
        int [][] arr ={{43,54,65},{54,56,87},{64,78,64},{43,67,78},{76,54,23}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j =arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
