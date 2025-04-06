package SmartHomeDevices;

public class Thermostat extends Device{
    private int temperatureSetting;

    public Thermostat(int deviceId, String status) {
        super(deviceId, status);
    }
    public void setTemperatureSetting(int temp){
        temperatureSetting = temp;

    }

    @Override
    public void displayStatus() {
        System.out.println("Status of Thermostat: "+getStatus());
    }
}
