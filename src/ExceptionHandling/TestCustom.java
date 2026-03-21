package ExceptionHandling;

public class TestCustom  {
    static void div(int a,int b) throws ExceptionPractice {
        if(b==0)
        {
            throw new ExceptionPractice("Cannot divide by zero");
        }
        else {
            System.out.println("Result is "+(a/b));
        }
    }

    public static void main(String[] args) {
        try{
            div(10,4);
        } catch (ExceptionPractice e) {
            System.out.println(e);
        }
    }
}
