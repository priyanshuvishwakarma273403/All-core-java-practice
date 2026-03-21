package Practice;

import java.util.ArrayList;

public class cwh_43 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Abhishek");
        list.add("Pritam");
        list.add("Mukesh");
        list.add("Arhan");
        list.add("Gukesh");
        list.add("Faisal");
        String [] arr = new String[list.size()];
        list.toArray(arr);
        for(String s: arr){
            System.out.print(s+" ");
        }
    }
}
