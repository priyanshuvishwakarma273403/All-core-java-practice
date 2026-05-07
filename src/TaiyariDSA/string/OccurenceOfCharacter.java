package TaiyariDSA.string;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "automation";
        char ch = 'a';
        int count = 0;
        for(char c : str.toCharArray()) {
            if(c == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
