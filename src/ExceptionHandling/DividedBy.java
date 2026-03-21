package ExceptionHandling;

public class DividedBy {
    static int dividedbyzero(int a,int b){
        int i = a/b;
        return i;
    }
    static int compute(int a,int b){
        int result =0;
        try {
            result = dividedbyzero(a, b);
        }
        catch(ArithmeticException e) {
            System.out.println("NumberFormatException is occured");
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
            int i = compute(a,b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
