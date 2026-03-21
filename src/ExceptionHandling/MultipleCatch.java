package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
                try
                {
                    try
                    {
                        int arr[] = new int[5];
                        arr[5]=100;
                    }

                    catch (ArrayIndexOutOfBoundsException e) {

                        System.out.println("Array Index out of Range");
                    }
                    try
                    {
                        int x=10/0;
                    }
                    catch (ArithmeticException e) {

                        System.out.println("Cannot Divide by zero");
                    }
                    try
                    {
                        String name = null;
                        System.out.println(name.length());
                    }catch (NullPointerException e) {

                        System.out.println("String name is Null");
                    }

                    String v = "ABC";
                    int i = Integer.parseInt(v);
                }
                catch (Exception e) {

                    System.out.println("All Exception are handle");
                }
                System.out.println("Programme Will Continue...");
            }

        }
//        try{
//            int [] arr = new  int[5];
//            arr[4]=100;
//            int x=10/2;
//            String name =null;
//            System.out.println(name.length());
//            String v ="Raghav";
//            int i =Integer.parseInt(v);
//
//        }
//        catch(ArithmeticException e){
//            System.out.println("Cannot divided by zero");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array index out of bounds");
//        }
//        catch (NullPointerException e){
//            System.out.println("NullPointer");
//        }
//        catch(NumberFormatException e){
//            System.out.println("NumberFormat");
//        }
//        catch(Exception e){
//            System.out.println(" All Exception are handled");
//        }
//        System.out.println("Program will continue : ");

