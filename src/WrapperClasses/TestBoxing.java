package WrapperClasses;

public class TestBoxing {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = Integer.valueOf(a); //Boxing
        System.out.println("Primitive :"+a);
        System.out.println("Wrapper :"+obj);

    }
}
