package DryPractice;

public class MissingString {
    public static void main(String[] args) {
       char ch[] = {'a','b','c','e'};
        System.out.println(findMissing(ch));
    }
    public static char findMissing(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-arr[i-1]>1)
            {
                return (char) (arr[i-1]+1);
            }
        }
        return '?';
    }
}
