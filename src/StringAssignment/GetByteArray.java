package StringAssignment;

public class GetByteArray {
    public static void main(String[] args) {
        String s = "I am java Developer";
        char [] ch = new char[s.length()];
        s.getChars(2,10, ch, 2);
        System.out.println(ch);


//        s.getBytes();
//        System.out.println(s);



    }
}
