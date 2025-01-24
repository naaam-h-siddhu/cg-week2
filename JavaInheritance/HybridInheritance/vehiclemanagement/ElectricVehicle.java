package vehiclemanagement;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge(){
        System.out.println("charger connected");
    }
}
