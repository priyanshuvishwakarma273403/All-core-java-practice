package Binary;

public class FirstOccurence {
    public static void main(String[] args) {
        int [] arr = {54,76,86,54,76,43,87,54,87,99,6,54,87};
        int target = 99;
        int left =0;
        int right = arr.length-1;
        int index=-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>target){
              right=mid-1;
            }
            else if(arr[mid]<target)
            {
               left=mid+1;
            }
            else{
                index=mid;
                right=mid-1;
            }
        }
        System.out.println(index);
    }
}
