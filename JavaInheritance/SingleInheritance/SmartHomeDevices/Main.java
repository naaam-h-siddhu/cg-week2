package SmartHomeDevices;

public class Main {
    public static void main(String[] args) {

        Device d1 = new Device(1, "Working");
        d1.displayStatus();
        Thermostat t1 = new Thermostat(2, "Broken");
        t1.displayStatus();

    }
}
