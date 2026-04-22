package TaiyariDSA.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(allPossibleStrings(s));
    }

    private static List<String> allPossibleStrings(String s) {
        List<String> list = new ArrayList<>();
        subset("",s,0,list);
        Collections.sort(list);
        return list;
    }

    private static void subset(String ans, String s, int idx, List<String> list) {
        if(idx == s.length()){
            if(ans.length() != 0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subset(ans+ch, s, idx+1, list);
        subset(ans,s,idx+1,list); // skip
    }
}
