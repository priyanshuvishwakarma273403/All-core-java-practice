package TaiyariDSA.string;

public class PalindromeChecking2 {
    public static void main(String[] args) {
        String str = "priyanshu";

        int i =0, j = str.length()-1;
        boolean flag = true;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("this is palindrome");
        } else{
            System.out.println("this is not palindrome");
        }


//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println(str.equalsIgnoreCase(reversed));
//        int i = 0, j = str.length()-1;
//        while (i < j) {
//            if (str.charAt(i) == str.charAt(j)) {
//                System.out.println("this is palindrome");
//                i++;
//                j--;
//            }else {
//                System.out.println("this is not palindrome");
//            }
//        }
    }
}
