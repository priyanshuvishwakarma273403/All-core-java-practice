package DryPractice;

public class Palidrone {
    public static void main(String[] args) {
        int [] arr = {1,3,3,1};
        boolean palidrome =true;
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]!=arr[arr.length-i-1])
            {
                palidrome=false;
                break;
            }
        }
        if(palidrome==true)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }
}
