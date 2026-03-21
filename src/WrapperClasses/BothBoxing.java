package WrapperClasses;

public class BothBoxing {
    public static void main(String[] args) {
        int a =10;
        Integer obj = a; //AutoBoxing

        Integer b =200;
        int x = b;  //AutoUnBoxing

        System.out.println("AutoBoxing :"+obj);
        System.out.println("AutoUnBoxing :"+x);
    }
}
