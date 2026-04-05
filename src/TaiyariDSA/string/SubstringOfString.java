package TaiyariDSA.string;

public class SubstringOfString {
    public static void main(String[] args) {
        String s = "toxic";
        for (int i = 0; i < s.length(); i++) {
            for(int j = i ; j < s.length(); j++) {
                System.out.print(s.substring(i, j+1)+ " ");
            }
            System.out.println();
        }
    }
}
