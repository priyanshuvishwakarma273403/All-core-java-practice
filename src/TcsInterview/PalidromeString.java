package TcsInterview;

public class PalidromeString {
    public static void main(String[] args) {
        String s = "hello";
        int n = s.length();
        int i = 0, j=n-1;
        boolean isPalindrome = true;
        while(i<j){
          if(s.charAt(i)!=s.charAt(j)){
              isPalindrome = false;
              break;
          }
          i++;
          j--;
        }
        System.out.println(isPalindrome);


//        for(int i = 0; i < n; i++) {
//            for (int j = n - 1; j > i; j--) {
//                if (s.charAt(i) != s.charAt(j)) {
//                    palindrome = false;
//                    break;
//                }
//            }
//            if (palindrome) {
//                System.out.println("Palindrome");
//            } else {
//                System.out.println("Not Palindrome");
//            }
//        }
    }
}
