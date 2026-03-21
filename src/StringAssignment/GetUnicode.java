package StringAssignment;

public class GetUnicode {
    public static void main(String[] args) {
        String str = "Java full stack";
      int first=  str.codePointAt(1);
       int second = str.codePointAt(5);
        System.out.println(first);
        System.out.println(second);

        //point before index question

        int third = str.codePointBefore(1);
        System.out.println(third);
        int fourth = str.codePointBefore(6);
        System.out.println(fourth);

        //codePoitnCount index question;
        int fifth = str.codePointCount(1, 14);
        System.out.println(fifth);
    }
}
