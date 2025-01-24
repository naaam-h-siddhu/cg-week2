package VehicleAndTransportSystem;

public class Main {
    public static void main(String[] args) {

        Vehicle[] v1 = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10),
                new MotorCycle(150, "Petrol", "Super Bike")
        };
        for(Vehicle v : v1) {
            v.displayInfo();
            System.out.println();
        }
    }
}
