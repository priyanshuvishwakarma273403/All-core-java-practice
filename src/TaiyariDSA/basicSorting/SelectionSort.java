package TaiyariDSA.basicSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){ // n-1 passes
            int min = Integer.MAX_VALUE , mindx = -1;
            for(int j = i ; j<n ; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        for( int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
