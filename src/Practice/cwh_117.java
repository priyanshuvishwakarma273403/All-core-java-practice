package Practice;

public class cwh_117 {
    public static void main(String[] args) {
        int row =2,column=3;
        int [][] firstmatrix = {{2,3,4},{4,3,4}};
        int [][] secondmatrix = {{2,3,4},{4,3,4}};
        int sum[][] =new int [row][column];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                sum[i][j]=firstmatrix[i][j]+secondmatrix[i][j];
            }
        }
        System.out.println();
        for(int []ele :sum)
        {
            for(int  ele2:ele)
            {
                System.out.print(ele2+" ");
            }
            System.out.println();


        }
    }
}
