package vehiclemanagement;


public class Main {
    public static void main(String[] args) {


        Vehicle v1 = new Vehicle("tata407", 100);
        PetrolVehicle p1 = new PetrolVehicle("Tata Nano", 80);
        p1.refuel();
        ElectricVehicle e1 = new ElectricVehicle("Tata nexon", 200);
        e1.charge();
    }
}
