package TaiyariDSA.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubset {
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subset("",s,0,list);
        System.out.println(list);
    }

    private static void subset(String ans, String s, int idx, List<String> list) {
        if(idx == s.length()){
            if(ans.length()!=0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subset(ans+ch,s, idx+1, list); //pick
        subset(ans,s,idx+1,list); //skip

    }
}
