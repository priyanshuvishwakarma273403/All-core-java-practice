package Practice;

public class cwh_115 {
    public static void display(int[] arr,int d){
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
     static void reverse(int[] arr, int i, int j) {
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        }
         public static void main(String[] args) {
             int arr[]={4,5,3,7,8,7,4,6};
             int d =2;
        display(arr,d);
    }
}
