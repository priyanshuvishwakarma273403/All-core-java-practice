package InnerClasses;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer("HP","5gen","Window 11");
        computer.getOs().display();

        Computer.USB usb = new Computer.USB("Type C");
        usb.display();
    }

}
