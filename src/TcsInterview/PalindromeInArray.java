package TcsInterview;

public class PalindromeInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,4,3};
        System.out.println( isPalindrome(arr));
//        int i = 0, j = arr.length - 1;
//        boolean palindrome = true;
//        while (i < j) {
//            if (arr[i] != arr[j]) {
//                palindrome = false;
//                break;
//            }
//            i++;
//            j--;
//        }
//        System.out.println(palindrome);
    }

    private static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
