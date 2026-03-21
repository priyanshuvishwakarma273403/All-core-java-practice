package ExceptionHandling;
import java.util.Scanner;
public class DivideException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = sc.nextInt();
            try {
                System.out.println(num1 / num2);
            } catch (ArithmeticException e) {
                System.out.println("No divide by zero Try greater than zero");
            }
            System.out.println("Thank you for choosing us !!");
    }
}
