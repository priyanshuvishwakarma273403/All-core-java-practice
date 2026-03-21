package InnerClasses;

class Outer{
    private static int data =10;
    private static void display(){
        System.out.println("hello display method of outer class");
    }
    static class Inner{
        void show(){
            System.out.println("value of outer class member"+data);
            display();

        }
        static void get(){
            System.out.println("hello get method of innner class");
        }
    }

}

public class StaticTest {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.show();
        Outer.Inner.get();

    }
}
