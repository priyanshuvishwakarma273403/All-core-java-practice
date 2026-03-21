package GenericsPractice;

interface Printerr{
    void print();
}

interface Scanner{
    void scan();
}

class AllInOneMachine implements Printerr,Scanner{
    public void print(){
        System.out.println("Printing...");
    }
    public void scan(){
        System.out.println("Scanning...");
    }
}

public class GenericException {
    public static<T extends Printerr & Scanner> void useDevice(T device){
        device.print();
        device.scan();
    }
    public static void main(String[] args) {
        AllInOneMachine machine = new AllInOneMachine();
        useDevice(machine);

    }
}
