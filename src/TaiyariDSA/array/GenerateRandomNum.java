package TaiyariDSA.array;

import java.util.Random;

public class GenerateRandomNum {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 1; i <= 10; i++){
            System.out.print(random.nextInt(100)+" ");
        }
    }
}
