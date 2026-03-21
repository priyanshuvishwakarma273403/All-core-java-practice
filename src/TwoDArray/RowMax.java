package TwoDArray;
//all row check maximun sum
public class RowMax {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,3,5,6,7},{4,5,6,7,8,9}};
        int maxrow=Integer.MIN_VALUE;
        int row =-1;
        for(int i=0;i<arr.length;i++){
            int sum =0; //for all row sum
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
           if(sum>maxrow){
               maxrow=sum;
               row=i;
           }
        }
        System.out.println(row+" "+maxrow);
    }
}
