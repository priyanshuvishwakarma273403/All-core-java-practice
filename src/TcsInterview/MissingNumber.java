package TcsInterview;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int n =  arr.length+1;
        int sum = n*(n+1)/2;
        int actual = 0;
        for(int ele : arr){
            actual+=ele;
        }
        System.out.println(sum- actual);
    }
}
