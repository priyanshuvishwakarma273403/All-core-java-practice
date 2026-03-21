package StringAssignment;

public class RemoveDuolicate {
    public static void main(String[] args) {
        String s = "Success";
        String res = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(res.indexOf(ch)==-1){
                res+=ch;
            }
        }
        System.out.println("Original String:" +s);
        System.out.println("Remove duplicate character:" +res);
    }
}