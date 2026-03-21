package Practice;

public class cwh_116 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = arr[n-1];
        for(int ele : arr)
        {
            if(largest<n){
               largest=ele;
            }
            else if(secondLargest<n&&largest!=n){
                largest=ele;
            }
        }
        System.out.println("Largest:"+largest);
        System.out.println("Second largest:"+secondLargest);
    }
}
