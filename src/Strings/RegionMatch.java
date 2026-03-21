package Strings;

public class RegionMatch {
    public static void main(String[] args) {
        String s1 = "hy dude Whats up!";
        String s2 = "Hy brother how are you";
      boolean b =  s1.regionMatches(0,s1,6,8);

       boolean b2 = s2.regionMatches(0,s2,6,8);
        System.out.println(b);
        System.out.println(b2);

        String s3 = s1.replace('d','f');
        System.out.println(s3);
        String s4 = s2.replaceAll("Hy","Hello");
        System.out.println(s4);

        System.out.println(s1.startsWith("hy"));
        System.out.println(s2.startsWith("hy"));

        System.out.println(s1.endsWith("hy"));
        System.out.println(s2.endsWith("you"));

        System.out.println(s1.substring(3,12));

        char [] ch = s1.toCharArray();
        System.out.println(ch);

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        System.out.println(s1.trim());

    }
}
