package VehicleAndTransportSystem;

public class Truck extends Vehicle {
    private int numberOfWheels;

    public Truck(int maxSpeed, String fuelType, int numberOfWheels) {
        super(maxSpeed, fuelType);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of wheels : "+numberOfWheels);
    }
}
