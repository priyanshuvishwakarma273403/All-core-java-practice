package Practice;

public class cwh_55 {
    public static void main(String[] args) {
        int [] arr = {77,78,80,81,82};
        long  n =arr.length+1;
        long sum = n*(n+1)/2;
        long arraysum = 0;
        for(int ele : arr){
            arraysum+=ele;
        }
        System.out.println((int) (sum-arraysum));
    }
}
