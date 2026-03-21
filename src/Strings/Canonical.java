package Strings;

public class Canonical {
    public static void main(String[] args) {
        String s = "java developer";
        String sb = new StringBuffer("java").append("developer").toString();
        String str = sb.intern();
        System.out.println(s==sb);
        System.out.println(s==sb.intern());
    }
}
