package TaiyariDSA.string;

public class RemoveAllWhiteSpace {
    public static void main(String[] args) {
        String str = " A u t o m a t i o n";
//        String result = String.valueOf(str.replaceAll(" ", "").length());
        String result = str.replaceAll("\\s+", "");
        System.out.println(result);
    }
}
