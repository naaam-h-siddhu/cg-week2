package VehicleAndTransportSystem;

public class MotorCycle extends Vehicle {
    private String type;

    public MotorCycle(int maxSpeed, String fuelType,String type) {
        super(maxSpeed,fuelType);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type of Bike: "+type);
    }
}
