package Strings;
//Sum of all substring printing number;
public class SumAllSubstring {
    public static void main(String[] args) {
        int sum=0;
        String str ="6759";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++){
              String sub=str.substring(i,j+1);
              sum+=Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }
}
