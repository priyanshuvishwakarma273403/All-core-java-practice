package InnerClasses;

class outer{
    private int data=100;
    private void display(){
        System.out.println("Hello display method of outer class");
    }
    class inner{
        void show(){
            System.out.println("Values of outer class memebers" +data);
            display();
        }
    }
}
public class main {
    public static void main(String[] args) {
        outer o = new outer();
        outer.inner i =  o.new inner();
        i.show();

    }
}
