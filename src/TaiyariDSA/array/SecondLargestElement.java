package TaiyariDSA.array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first; // old largest becomes second
                first = num;    // new largest
            }
            else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println(second);
    }
}