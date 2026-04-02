package TaiyariDSA.basicSorting;

public class KthSmallest {
    public static void main(String[] args) {
        int [] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 2;
        System.out.println( ksmallest(arr,k));
    }

     static int ksmallest(int[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE , mindx = -1;
            for(int j = i; j<n; j++ ){
                if(arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[mindx];
            arr[mindx] = arr[i];
            arr[i] = temp;
        }
        return arr[k-1];
    }
}
