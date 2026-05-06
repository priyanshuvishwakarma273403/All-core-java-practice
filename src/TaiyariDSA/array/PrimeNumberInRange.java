package TaiyariDSA.array;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        int start = 10, end = 50;
        for(int i=start; i<=end; i++){
            boolean isPrime = true;
            for(int j = 2; j<= Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && i >1){
                System.out.print(i+" ");
            }
        }
    }
}
