package TaiyariDSA.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "shaima";
//        for(int i = str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i)+" ");
//        }

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
