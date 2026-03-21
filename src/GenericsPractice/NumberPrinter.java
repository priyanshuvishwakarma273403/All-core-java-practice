package GenericsPractice;

class Printer{
    <T extends Number>  Printer(T number){
        System.out.println("Number "+number);
        System.out.println(getClass().getName());
    }
}

public class NumberPrinter {
    public static void main(String[] args) {
        new Printer(100);
        new Printer(3.0);

//        new Printer("Number");
        //compile time error because string is not a number

    }
}
