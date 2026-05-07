package TaiyariDSA.string;

public class MaximumOccurence {
    public static void main(String[] args) {
        String str = "programming";
        char maxChar = str.charAt(0);
        int maxCount = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }
        System.out.println("Maximum occurring character : " + maxChar);
        System.out.println("Count : " + maxCount);
    }
}
