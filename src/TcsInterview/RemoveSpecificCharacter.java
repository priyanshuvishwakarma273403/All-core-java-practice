package TcsInterview;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        String str = "himanshu";
        char ch = str.charAt(2);
        str = str.replace(Character.toString(ch), "p");
        System.out.println(str);

    }
}
