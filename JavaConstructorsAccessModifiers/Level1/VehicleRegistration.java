public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle verna = new Vehicle("Siddhu","Sedan");
        verna.displayVehicleDetails();
        Vehicle.updateRegistrationFee(10000);
        verna.displayVehicleDetails();
    }
}
class Vehicle{
    private String ownerName;
    private String vehicleType;
    private static int registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails(){
        System.out.println("Owner name : "+ownerName);
        System.out.println("Type of Vehicle: "+vehicleType);
        System.out.println("Registration Charge : "+registrationFee);
    }
    public static void updateRegistrationFee(int fee){
        registrationFee = fee;
    }
}
