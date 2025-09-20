package Inheritance_Assignment;

class Device {
    String deviceId;
    String status;

    Device(String id, String status) {
        this.deviceId = id;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String id, String status, int temp) {
        super(id, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temperature: " + temperatureSetting);
    }
}

public class DeviceTest {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("TH123", "ON", 24);
        t.displayStatus();
    }
}
