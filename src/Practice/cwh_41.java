package Practice;

public class cwh_41 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,0,1,1,1,0,0};
        int n = arr.length;
        int  i =0,j =n-1;
        while(i<j){
            if(arr[i]==0)i++;
            else if(arr[j]==1)j--;
            else if(arr[j]==0&&arr[i]==1){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        System.out.println(arr[i]);
        System.out.println(arr[j]);

    }
}
