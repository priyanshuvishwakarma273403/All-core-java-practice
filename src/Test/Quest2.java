package Test;
class Vehicle{
    private String RegistractionNumber;
    private String ownerName;
    private String VehicleType;
    static {
        System.out.println("===Welcome to Vehicle Registraction System===");
    }
    Vehicle(String RegistractionNumber,String ownerName,String VehicleType){
        this.RegistractionNumber=RegistractionNumber;
        this.ownerName=ownerName;
        this.VehicleType=VehicleType;

    }
    void display(){
        System.out.println("Registraction Number:"+RegistractionNumber);
        System.out.println("Owner Name:"+ownerName);
        System.out.println("Vehicle Type:"+VehicleType);
    }
}
public class Quest2 {
    public static void main(String[] args) {
       Vehicle vehicle=new Vehicle("12345","Vijay","2 Wheeler");
       vehicle.display();
    }
}
