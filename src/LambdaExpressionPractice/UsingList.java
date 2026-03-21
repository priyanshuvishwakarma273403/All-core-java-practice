package LambdaExpressionPractice;

import java.util.Arrays;
import java.util.List;

public class UsingList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original List: " + numbers);

        // 1. Print all number
        System.out.print("\nAll numbers: ");
        numbers.forEach(System.out::print);

        // 2. Print even numbers only
        System.out.println("\n Even numbers: ");
        numbers.forEach(n ->{
            if(n%2==0){
                System.out.print(n);
            }
        });

        // 4. Square of each number
        System.out.print("\n\nSquares: ");
        numbers.stream()
                .map(n -> n*n)
                .forEach(System.out::print);

        // 5. Sum of all numbers
        int sum = numbers.stream()
                .reduce(0,(a,b) -> a+b);
        System.out.println("\nSum: " + sum);


    }
}
