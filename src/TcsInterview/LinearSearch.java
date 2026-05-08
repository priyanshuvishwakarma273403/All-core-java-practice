package TcsInterview;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,9,5,4,8};
        int target = 91;
        boolean flag = false;
        for(int ele : arr){
            if(ele==target){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
