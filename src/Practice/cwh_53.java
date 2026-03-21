package Practice;

public class cwh_53 {
    public static void main(String[] args) {
        int [] arr = {-1,34,56,78,90};
        int target =-1;
        int found =-786;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found =i;
                break;
            }
        }
        if(found!=-786) System.out.println("Target exists in array at index" +" "+ found);
        else System.out.println("Target missing in the array");
    }
}
