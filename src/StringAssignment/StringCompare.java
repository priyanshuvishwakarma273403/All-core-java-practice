package StringAssignment;

public class StringCompare {
    public static void main(String[] args) {
        String str =  "Ankit";
        String str2 ="Abhishek";
       int variable = str.compareTo(str2);
        if(variable<0)
        {
            System.out.println("Strings "+str+"is less than "+str2);
        }
        else if (variable==0)
        {
            System.out.println("Strings "+str+"is equal to "+str2);
        }
        else {
            System.out.println("Strings "+str+"is greater than "+str2);
        }
    }
}
