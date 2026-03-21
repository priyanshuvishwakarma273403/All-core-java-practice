package RegularExpression;

public class TestRegexExample10 {
    public static void main(String[] args) {
//        String s = "Order_123";
//        s = s.replaceAll("\\d","X");
//        System.out.println(s);

        String s = "Hello123World";
        s = s.replaceAll("(\\d)", "|");
        System.out.println(s);
    }
}
