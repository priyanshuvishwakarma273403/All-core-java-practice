package Practice;

public class cwh_15 {
    public static void main(String[] args) {
        int [][] a = new int [10][10];
        for(int i=10;i>0;i--){
            for(int j=0;j<10-i;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
