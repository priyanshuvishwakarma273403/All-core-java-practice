package Strings;

public class SplitStrings {
    public static void main(String[] args) {
        String s = "Kya re Kaliya kitne aadmi the";
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        sb.append(split[0]);
        System.out.println(split.length);
        System.out.println(sb);
    }
}