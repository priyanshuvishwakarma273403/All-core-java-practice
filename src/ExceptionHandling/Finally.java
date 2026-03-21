package ExceptionHandling;
import java.util.*;
public class Finally {
    public static void main(String[] args) {

        Finally obj = new Finally();
        System.out.println("HashCode"+obj.hashCode());
        obj=null;
        System.gc();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("End of the garbace collector");
    }
//    @Override  protected void finalize()
//    {
//        System.out.println("Called the finalize() method");
//    }
}
