public class HotelBookingSystem {
    public static void main(String[] args) {
        // default constructor
        HotelBooking room1 = new HotelBooking();
        // parameterised constructor
        HotelBooking room2 = new HotelBooking("Shyam","21c",1);
        // copy constructor
        HotelBooking room3 = new HotelBooking(room2);
        room1.getter();
        System.out.println();
        room2.getter();
        System.out.println();
        room3.getter();
    }
}
class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking(){
        guestName = "Siddhu";
        roomType = "Villa";
        nights = 365;
    }
    public HotelBooking(String guestName,String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking temp){
        this.guestName = temp.guestName;
        this.roomType = temp.roomType;
        this.nights = temp.nights;
    }
    public void getter(){
        System.out.println("Guest name : "+guestName);
        System.out.println("Room type : "+roomType);
        System.out.println("number of nights : "+nights);
    }
}
