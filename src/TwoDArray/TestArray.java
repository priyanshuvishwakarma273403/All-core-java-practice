package TwoDArray;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
            // Example for binarySearch on byte[]
            byte[] byteArr = {1, 3, 5, 7, 9};
            byte byteKey = 5;
            int byteIndex = Arrays.binarySearch(byteArr, byteKey);
            System.out.println("Index of " + byteKey + " in byteArr: " + byteIndex);

            int byteRangeIndex = Arrays.binarySearch(byteArr, 1, 4, (byte)7);
            System.out.println("Index of 7 in byteArr[1..4]: " + byteRangeIndex);

            // Example for binarySearch on char[]
            char[] charArr = {'a', 'c', 'e', 'g'};
            char charKey = 'e';
            int charIndex = Arrays.binarySearch(charArr, charKey);
            System.out.println("Index of '" + charKey + "' in charArr: " + charIndex);

            int charRangeIndex = Arrays.binarySearch(charArr, 1, 3, 'e');
            System.out.println("Index of 'e' in charArr[1..3]: " + charRangeIndex);

            // Example for binarySearch on double[]
            double[] doubleArr = {1.1, 2.2, 3.3, 4.4};
            double doubleKey = 3.3;
            int doubleIndex = Arrays.binarySearch(doubleArr, doubleKey);
            System.out.println("Index of " + doubleKey + " in doubleArr: " + doubleIndex);

            int doubleRangeIndex = Arrays.binarySearch(doubleArr, 0, 3, 2.2);
            System.out.println("Index of 2.2 in doubleArr[0..3]: " + doubleRangeIndex);

            // Example for binarySearch on float[]
            float[] floatArr = {1.0f, 2.0f, 3.0f, 4.0f};
            float floatKey = 3.0f;
            int floatIndex = Arrays.binarySearch(floatArr, floatKey);
            System.out.println("Index of " + floatKey + " in floatArr: " + floatIndex);

            int floatRangeIndex = Arrays.binarySearch(floatArr, 1, 4, 4.0f);
            System.out.println("Index of 4.0 in floatArr[1..4]: " + floatRangeIndex);

            // Example for binarySearch on int[]
            int[] intArr = {10, 20, 30, 40, 50};
            int intKey = 30;
            int intIndex = Arrays.binarySearch(intArr, intKey);
            System.out.println("Index of " + intKey + " in intArr: " + intIndex);

            int intRangeIndex = Arrays.binarySearch(intArr, 2, 5, 40);
            System.out.println("Index of 40 in intArr[2..5]: " + intRangeIndex);

            // Example for binarySearch on long[]
            long[] longArr = {100L, 200L, 300L, 400L};
            long longKey = 300L;
            int longIndex = Arrays.binarySearch(longArr, longKey);
            System.out.println("Index of " + longKey + " in longArr: " + longIndex);

            int longRangeIndex = Arrays.binarySearch(longArr, 1, 4, 400L);
            System.out.println("Index of 400 in longArr[1..4]: " + longRangeIndex);

            // Example for binarySearch on Object[]
            String[] strArr = {"apple", "banana", "cherry", "date"};
            String strKey = "cherry";
            int strIndex = Arrays.binarySearch(strArr, strKey);
            System.out.println("Index of \"" + strKey + "\" in strArr: " + strIndex);

            int strRangeIndex = Arrays.binarySearch(strArr, 1, 3, "banana");
            System.out.println("Index of \"banana\" in strArr[1..3]: " + strRangeIndex);

            // Example for binarySearch on short[]
            short[] shortArr = {2, 4, 6, 8, 10};
            short shortKey = 6;
            int shortIndex = Arrays.binarySearch(shortArr, shortKey);
            System.out.println("Index of " + shortKey + " in shortArr: " + shortIndex);

            int shortRangeIndex = Arrays.binarySearch(shortArr, 2, 5, (short)10);
            System.out.println("Index of 10 in shortArr[2..5]: " + shortRangeIndex);
        }
    }



