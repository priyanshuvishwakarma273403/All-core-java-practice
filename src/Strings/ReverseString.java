package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "automation";
//        StringBuilder reversed = new StringBuilder(str).reverse();
//        System.out.println(reversed);  // this is for method


//        for(int i=0;i<str.length();i++){
//            System.out.print(str.charAt(i)+" ");
//        }  print all the string char


        // reverse string
        for(int i =  str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
