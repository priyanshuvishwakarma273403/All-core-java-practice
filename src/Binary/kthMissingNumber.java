package Binary;

public class kthMissingNumber {
    public static void main(String[] args) {
        int [] arr ={2,3,4,7,11};
        int target = 5;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int correctno = mid+1;
            int missing  = arr[mid]-correctno;
            if(missing>=target){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        System.out.println("Target is: "+target);  //not done yet

    }
}
