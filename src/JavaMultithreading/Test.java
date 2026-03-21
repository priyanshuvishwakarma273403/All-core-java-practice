package JavaMultithreading;

public class Test {
    public static void main(String[] args) {
        World world = new World();
        Thread thread = new Thread(world);
        thread.start();
        for(;;){
            System.out.println("Hello!!!");
        }
    }
}

//public class Test {
//    public static void main(String[] args) {
//        World world = new World();
//        world.start();
//        for(;;){
//            System.out.println("Hello");
//        }
//    }
//}
