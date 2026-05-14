package codewithprayutosh.twoPointer;

public class RemoveDuplicate {

    private static int removeDuplicateMethod(int[] arr) {
        int j = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicateMethod(arr);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}