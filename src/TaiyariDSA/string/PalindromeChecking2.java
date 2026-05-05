package TaiyariDSA.string;

public class PalindromeChecking2 {
    public static void main(String[] args) {
        String str = "Malayalam";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equalsIgnoreCase(reversed));
    }
}
