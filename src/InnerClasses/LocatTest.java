package InnerClasses;

class Outer2{
    private static int data =100;
    void fun(){
        class Inner2{
            void show(){
                System.out.println("Value of outer member "+data);
            }
        }
        Inner2 inner = new Inner2();
        inner.show();
    }
}

public class LocatTest {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.fun();

    }
}
