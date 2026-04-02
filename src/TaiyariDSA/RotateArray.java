package TaiyariDSA;

// Output: [3, 4, 5, 1, 2]
public class RotateArray {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};
       int n = arr.length;
       int d = 2;
       d %= n;
       reverse(arr,0,d-1);
       reverse(arr, d, n-1);
       reverse(arr, 0, n-1);
       for(int ele : arr){
           System.out.print(ele+" ");
       }
    }
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
