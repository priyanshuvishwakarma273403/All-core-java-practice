package DryPractice;

public class ArmStrongOfNumber {
    public static void main(String[] args) {
        int nums = 9474;
        int sum = 0, temp = nums;
        int count = String.valueOf(nums).length();
        while(temp!=0){
           int digit = temp%10;
           sum+=Math.pow(digit,count);
            temp /= 10;
        }
        System.out.println(nums==sum);
    }
}
