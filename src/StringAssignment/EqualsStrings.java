package StringAssignment;

public class EqualsStrings {
    public static void main(String[] args) {
        String s1 = "Mitchel Marse";
        String s2 = "mitchel marse";
        String s3 = "Mitchel Marse";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
            //  CHECKING EQUALS IF UPPERCASE MATCH THEN GIVE TRUE
        //IF WE USE IGNORECASE THEN EQUALS UPPER AND LOWERCASE
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
