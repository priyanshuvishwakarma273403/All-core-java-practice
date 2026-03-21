package Strings;

public class ReverseWordsString {
    public static void main(String[] args) {
        String s = "Mogambo Khush Hua";
        StringBuilder sb=new StringBuilder();
        String [] arr = s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
