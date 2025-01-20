public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicles car = new Vehicles("Siddhu", "Sedan", 4343);
        Vehicles.getRegistrationFee();
        Vehicles.updateRegistrationFee(5000);
        Vehicles.getRegistrationFee();
        car.getVehicleDetails();

        if(car instanceof Vehicles){
            System.out.println("Yes its a instance of Vehicle");
        }

    }
}
class Vehicles{
    private static int registrationFee = 1000;
    private String ownerName;
    private String vehicleType;
    private final int resitrationNumber;
    public Vehicles(String ownerName, String vehicleType, int registrationFee){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.resitrationNumber = registrationFee;
    }
    public static void updateRegistrationFee(int newFee){
        registrationFee = newFee;

    }
    public static void getRegistrationFee(){
        System.out.println("Registration Fee = "+registrationFee);
    }
    public void getVehicleDetails(){
        System.out.println("Owner name: "+ownerName);
        System.out.println("Vehicle Type : "+vehicleType);
        System.out.println("Registration number: "+resitrationNumber);
    }

}
