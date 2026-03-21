package ExceptionHandling;
import java.util.Scanner;
public class ArrayIndexOfBound {
    public static void main(String[] args) {
            int arr [] = {43,65,76,87,53,65};
            Scanner sc = new Scanner(System.in);
            try {
                try {
                    System.out.println("Enter Index:");
                    int n = sc.nextInt();

                    System.out.println("Enter Value:");
                    int m = sc.nextInt();
                    int[] newArr = new int[arr.length + 1];

                    for (int i = 0, j = 0; i < newArr.length; i++) {
                        if (i == n) {
                            newArr[i] = m;

                        } else {
                            newArr[i] = arr[j];
                            j++;
                        }
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index Out Of Bound");
                }
                catch(Exception e) {
                    System.out.println("Mismatch");
                }
                finally {
                    System.out.println("Program continue after handling the exception");
                }
            }
            finally {
                System.out.println("Enter only integer");
            }
        System.out.println("Thanking you for choosing us !!");
    }
}

