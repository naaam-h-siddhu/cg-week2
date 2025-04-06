package SmartHomeDevices;

public class Device {
    private int deviceId;
    private String status;

    public String getStatus() {
        return status;
    }

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayStatus(){
        System.out.println("Status of device "+status);
    }
}
