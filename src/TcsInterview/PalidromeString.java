package TcsInterview;

public class PalidromeString {
    public static void main(String[] args) {
        String s = "racecar";
        int n = s.length();
        boolean palindrome = true;
        for(int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    palindrome = false;
                    break;
                }
            }
            if (palindrome) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }
}
