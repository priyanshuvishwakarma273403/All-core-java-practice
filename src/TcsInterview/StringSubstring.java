package TcsInterview;

public class StringSubstring {
    public static void main(String[] args) {
        String str = "toxic";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.print(str.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
}
