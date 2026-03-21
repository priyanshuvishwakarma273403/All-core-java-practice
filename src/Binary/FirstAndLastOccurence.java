package Binary;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int arr [] = {32,45,65,44,44,76,54,65};
        int target =44;
        int low =0,high=arr.length-1,indx=-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>target){
                high = mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                indx=mid;
                high=mid-1;
            }
        }
        System.out.println("First occurence is "+indx);
        low =0;
        high=arr.length-1;
        indx=-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>target){
              high = mid-1;
            }
            else if(arr[mid]<target){
              low=mid+1;
            }
            else {
                indx=mid;
               low=mid+1;
            }
        }
        System.out.println("Last occurence is "+indx);
    }
}
