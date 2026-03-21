package TwoDArray;

public class New {
    public static void main(String[] args) {
        int [][] arr ={{23},{2,4},{43,54,23},{54,65,43,54},{32,32,43,43,32}};
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
