package InnerClasses;

public class Computer {
    private String brand;
    private String model;
    private OperatingSystem osName;

    static class USB{
        private String type;
         public USB(String type){
             this.type=type;
         }
         public void display(){
             System.out.println("USP Type :"+type);
         }
    }

    public OperatingSystem getOs() {
        return osName;
    }

     Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.osName = new OperatingSystem(osName);

    }
    class OperatingSystem {
        private String osName;
         OperatingSystem(String osName) {
            this.osName = osName;
        }
        public void display() {
            System.out.println("Brand :"+ brand + " Computer Model: " +model + " "+ "OS: " + osName);
        }
    }
}
