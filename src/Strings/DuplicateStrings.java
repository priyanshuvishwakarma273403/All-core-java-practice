package Strings;

public class DuplicateStrings {
    public static void main(String[] args) {
        String str [] ={"Vaibhav"};
        int variable = 0;
        for(int i=0;i<str.length;i++){
            boolean b = false;
            for(int  j=0;j<str.length;j++){
                if(str[i]==(str[j])){
                 b =true;
                   break;
                }
            }
            if(!b){
              str[variable]=str[i];
              variable++;
            }
        }
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]+" ");
        }

    }
}
