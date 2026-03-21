package Practice;

public class cwh_21 {
    public static void main(String[] args) {
        int arr [] = {12,34,45,9,8,90,3};
        int n = arr.length;
        int evenNumber =0;
        int oddNumber =0;

        for(int ele:arr)
        {
            if(ele %2==0) evenNumber++;
            else oddNumber++;
        }
        for(int ele:arr)
            {
            if(ele%2==0) System.out.println("even");
            else System.out.println("odd");
            }
    }
}
