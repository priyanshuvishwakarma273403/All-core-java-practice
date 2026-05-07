package TaiyariDSA.array;

public class PerfectNumber {
    public static void main(String[] args) {
        int nums = 28;
        int sum = 0;
        for(int i= 1; i<= nums/2; i++){
           if(nums % i == 0){
               sum += i;
           }
        }
        System.out.println(nums == sum);
    }
}
