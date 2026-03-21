package DryPractice;

public class MissingXOR {
    public static void main(String[] args) {
        int [] arr = {1,2,7,6,3,4};
        int n = arr.length+1;
        int xor =0;
        for(int i=1;i<= n;i++)
        {
            xor ^= i;
        }
        int xor2 =0;
        for(int ele : arr)
        {
            xor2 ^= ele;
        }
        System.out.println(xor^xor2);
    }
}
