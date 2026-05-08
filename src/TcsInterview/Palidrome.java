package TcsInterview;

public class Palidrome {
    public static void main(String[] args) {
        String str = "madam";
        int left = 0, right = str.length() - 1;
        boolean flag = true;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(flag);
    }
}
