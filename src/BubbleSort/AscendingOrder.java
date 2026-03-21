package BubbleSort;

public class AscendingOrder {
    public static void main(String[] args) {
        int [] arr = {5,2,4,1,3};
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
       for(int ele:arr){
           System.out.print(ele+" ");
       }
    }
}
