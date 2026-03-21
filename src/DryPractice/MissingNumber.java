package DryPractice;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,7,3,4,5,6};
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int arraySum = 0;
        for(int ele:arr)
        {
            arraySum=arraySum+ele;
        }
        System.out.println(sum-arraySum);
    }
}
