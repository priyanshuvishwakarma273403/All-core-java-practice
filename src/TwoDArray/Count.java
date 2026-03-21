package TwoDArray;

public class Count {
    public static void main(String[] args) {
        int [][] arr={{5,0,0,3},{5,7,0,9},{0,2,0,1},{6,3,0,4}};
       int  count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}
