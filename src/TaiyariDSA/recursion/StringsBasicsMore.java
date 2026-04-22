package TaiyariDSA.recursion;

import java.util.ArrayList;
import java.util.List;

public class StringsBasicsMore {
    public static void main(String[] args) {
        String s = "Priyanshu";
        change(s);
        System.out.println(s);
        String [] arr = {"Abhishek", "Ashu", "Faiz","Ankit","Shaima","Prajakta"};
        List<String> al = new ArrayList<>();
        al.add("Shravani");
        al.add("Umang");
        al.add("Ayan");
        al.add("Shelly");
        al.add("Riya");
        System.out.println(al);
        change2(al);
        System.out.println(al);

    }

    private static void change2(List<String> al) { // passs by refernces
        al.add("Biplab");

    }

    private static void change(String s) {  //immutable passs by value
        s = "Lavkesh";

    }
}
