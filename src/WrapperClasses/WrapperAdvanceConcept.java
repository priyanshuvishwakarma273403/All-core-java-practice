package WrapperClasses;

import org.w3c.dom.ls.LSOutput;

public class WrapperAdvanceConcept {
    public static void main(String[] args) {
        System.out.println("===CACHING BEHAVIOUR===");
        Integer a = 100;
        Integer b = 100;

        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);
        System.out.println(c.equals(d));

        System.out.println("\nALL WRAPPER CLAASES");
        byte primByte = 10;
        Byte wrapperByte = primByte;
        byte unwrappedByte = wrapperByte;
        System.out.println("Byte: "+wrapperByte);


        short primShort = 1000;
        Short wrapperShort = primShort;
        short unwrappedShort = wrapperShort;
        System.out.println("Short: "+wrapperShort);

        char primChar = 'a';
        Character wrapperChar = primChar;
        char unwrappedChar = wrapperChar;
        System.out.println("Char: "+wrapperChar);

        System.out.println("\n===Method Overloading===");
        System.out.println("\n===Type Conversion===");
        Integer intval = 42;
        Double doubleval = intval.doubleValue();
        Long longval = intval.longValue();
        String strval = intval.toString();

        System.out.println("Integer: "+intval);
        System.out.println("Double: "+doubleval);
        System.out.println("Long: "+longval);
        System.out.println("String: "+strval);

        System.out.println("\n===Ternary Opertator===");
        Integer nullValu = null;
        Integer nonnullValue = 10;
        try{
            int result = true? nullValu :0;

        }
        catch(NullPointerException e){
            System.out.println("NullPointerException "+e);
        }

        Integer saferesult  = true? nullValu:Integer.valueOf(0);
        System.out.println("Safe result: "+saferesult);

        System.out.println("\n===Immutability=== ");
        Integer original = 100;
        Integer modify = original;
        modify =200;
        System.out.println("Original value: "+original);
        System.out.println("Modify value: "+modify);
        System.out.println("Wrapper objects Are immutable");

    }
    public static void printValue(int value){
        System.out.println("Primitive int: "+value);

    }
    public static void printValue(Integer value){
        System.out.println("Wrapper Integer: "+value);
    }


}
