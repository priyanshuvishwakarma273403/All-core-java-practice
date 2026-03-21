package Practice;

public class cwh_20 {
    public static void main(String[] args) {
        int arr []  = {8,2,4,5,3,7,1};
        int n = arr.length+1;
        int sum = n*(2+1)/2;
        int arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }
        System.out.println(sum-arraySum);
    }
}
