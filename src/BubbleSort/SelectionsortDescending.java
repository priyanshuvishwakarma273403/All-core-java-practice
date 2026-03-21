package BubbleSort;

public class SelectionsortDescending {
    public static void main(String[] args) {
        int [] arr = {5,2,4,1,3};
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int max = Integer.MIN_VALUE , maxindx = -1;
            for(int j=i;j<n;j++){
                if(arr[j]>max){
                    max = arr[j];
                    maxindx = j;
                }
            }
            int temp = arr[maxindx];
            arr[maxindx] = arr[i];
            arr[i] = temp;

        }
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}
