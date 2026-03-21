package RegularExpression;

public class TestRegexExample11 {
    public static void main(String[] args) {
        String text = "apple,banana;orange|mango>Orange";
        String [] parts = text.split("[,;|>]");
        for(String str : parts){
            System.out.print(str+"  ");
        }
    }
}
