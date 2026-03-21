package LambdaExpressionPractice;

interface myFunc{
    void show();
}
interface Print{
    void print(String msg);
}
interface addMul{
    int sum(int a, int b);
}

public class PracticeNum1 {
    public static void main(String[] args) {
        myFunc fun = () -> {
            System.out.println("Hello World");
        };
        Print print = System.out::println;
        addMul mul = Integer::sum;
        System.out.println(mul.sum(1,2));
        fun.show();
        print.print("Hello ");
    }
}
