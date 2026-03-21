package TwoDArray;

public class Max {
    public static void main(String[] args) {
        int [][] arr ={{43,43},{54,54,65,77},{67,88,99,43}};
        int max =Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>smax&&arr[i][j]!=max){
                    smax=arr[i][j];
                }
            }
        }
        System.out.println("Second max"+smax);
        System.out.println("Max"+max);
    }
}
