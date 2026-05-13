package codewithprayutosh.twoPointer;

import java.util.*;

public class SquareSortedArray {

    private static int[] sortedSquare(int[] arr) {
        List<Integer> negative = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();

        // Separate negative and positive numbers
        for (int ele : arr) {
            if (ele < 0) negative.add(ele);
            else positive.add(ele);
        }

        // square negatives
        for (int i = 0; i < negative.size(); i++) {
            negative.set(i, negative.get(i) * negative.get(i));
        }
        Collections.reverse(negative);

        // square positives
        for (int i = 0; i < positive.size(); i++) {
            positive.set(i, positive.get(i) * positive.get(i));
        }

        int i = 0, j = 0, k = 0;
        int[] result = new int[arr.length];

        while (i < negative.size() && j < positive.size()) {
            if (negative.get(i) <= positive.get(j)) {
                result[k++] = negative.get(i++);
            } else {
                result[k++] = positive.get(j++);
            }
        }

        while (i < negative.size()) {
            result[k++] = negative.get(i++);
        }

        while (j < positive.size()) {
            result[k++] = positive.get(j++);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquare(arr)));
    }
}