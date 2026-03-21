package StringAssignment;

public class CharacterStringArray {
    public static void main(String[] args) {
        char [] ch = {'1','2','3','4'};
        String s = String.copyValueOf(ch,1,3);
        System.out.println("The copy character is :" +s);

    }
}
