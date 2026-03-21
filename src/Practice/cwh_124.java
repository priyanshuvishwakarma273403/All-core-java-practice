package Practice;

public class cwh_124 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("GeeksForGeeks");
        System.out.println(s);

        s.append("is awesome");
        System.out.println(s);

        s.insert(15,"Java");
        System.out.println(s);
        s.replace(0,5,"Welcome");
        System.out.println(s);

        s.delete(8,14);
        System.out.println(s);

        s.reverse();
        System.out.println(s);

        int length=s.length();
        System.out.println(length);

        char charAt5 =s.charAt(5);
        System.out.println(charAt5);
        s.setCharAt(5,'x');
        System.out.println(s);
         String subString = s.substring(5,10);
         System.out.println(subString);

         s.reverse();
         int indexOfGeeks = s.indexOf("Geeks");
         System.out.println(indexOfGeeks);
         s.deleteCharAt(5);
        System.out.println(s);
        String result = s.toString();
        System.out.println(result);



//        StringBuilder s = new StringBuilder();
//        s.append("Hello Worlds");
//        System.out.println(s);
//
//        StringBuilder s1 = new StringBuilder(50);
//        s1.append("This has initial capacity 50");
//        System.out.println(s1);
//
//        CharSequence cs = "Java";
//        StringBuilder s3 = new StringBuilder(cs);
//        s3.append("Java Progrmming");
//        System.out.println(s3);

    }
}
