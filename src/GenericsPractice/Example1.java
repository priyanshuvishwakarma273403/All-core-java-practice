package GenericsPractice;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        list.add("PawPaw");
        list.add("chawhaw");
        String s = list.get(0);
        String s1 = list.get(1);

        System.out.println(s);
        System.out.println(s1);
    }
}
