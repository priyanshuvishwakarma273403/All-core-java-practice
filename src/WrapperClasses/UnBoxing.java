package WrapperClasses;

public class UnBoxing {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(50);
        int a = obj.intValue(); //unBoxing
//        int a = 10;
//        Integer obj = a;

        System.out.println("Wrapper :"+obj);
        System.out.println("Primitive :"+a);
    }
}
