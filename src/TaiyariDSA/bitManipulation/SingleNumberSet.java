package TaiyariDSA.bitManipulation;

public class SingleNumberSet {
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 2};
        System.out.println( getSingle(arr));
    }

    private static int getSingle(int[] arr) {
        int xor = 0;
        for(int element : arr){
            xor ^= element;
        }
        return xor;
    }
}

//Input: arr[] = [1, 1, 2, 2, 2]
//Output: 2
//Explanation: In the given array all element appear two times except 2 which appears thrice.