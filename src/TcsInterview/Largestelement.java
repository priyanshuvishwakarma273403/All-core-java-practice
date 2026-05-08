package TcsInterview;

public class Largestelement {
    public static void main(String[] args) {
        int [] arr = {1,20,3,4,5,6};
        int max = arr[0];
        for(int ele : arr){
            if(ele>max){
                max = ele;
            }
        }
        System.out.println(max);
    }
}
