package InnerClasses;

public class Hotel {
    private String name;
    private int totalRoom;
    private int reservedRoom;
    public Hotel(String name, int totalRoom, int reservedRoom) {
        this.name = name;
        this.totalRoom = totalRoom;
        this.reservedRoom = reservedRoom;
    }
    public void reserveRoom(String guestName,int Numberofroom)
    {
        class ReservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest Name cannot be null or blank");
                    return false;
                }
                if(Numberofroom<0){
                    System.out.println("Number of rooms should be positive");
                    return false;
                }
                if(reservedRoom+Numberofroom>totalRoom){
                    System.out.println("not enough rooms Available");
                    return false;

                }
                return true;
            }
        }

            ReservationValidator validator = new  ReservationValidator();
        if(validator.validate()){
            reservedRoom+=Numberofroom;
            System.out.println("Reservation Successful for"+guestName+"for"+Numberofroom);
        }
        else{
            System.out.println("Reservation Failed for"+guestName+"for"+Numberofroom);
        }
    }

}
