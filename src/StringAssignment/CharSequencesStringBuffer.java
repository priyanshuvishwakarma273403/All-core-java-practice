package StringAssignment;

public class CharSequencesStringBuffer {
    public static void main(String[] args) {
        String s1 = "Java Developer", s2 = "java Developer";
        StringBuffer str = new StringBuffer(s1);
        System.out.println(s1.contentEquals(str));
        System.out.println(s2.contentEquals(str));
    }
}
