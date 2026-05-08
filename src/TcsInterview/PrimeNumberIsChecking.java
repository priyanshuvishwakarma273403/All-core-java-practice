package TcsInterview;

public class PrimeNumberIsChecking {
    public static void main(String[] args) {
        int num = 9;
        boolean isPrime = true;
        for(int i = 2; i<num; i++){
           if(num % i == 0){
               isPrime = false;
               break;
           }
        }
        System.out.println(isPrime);
    }
}
