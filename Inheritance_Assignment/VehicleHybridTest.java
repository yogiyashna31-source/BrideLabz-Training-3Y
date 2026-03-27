package Inheritance_Assignment;

interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int speed, String model) {
        this.maxSpeed = speed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int speed, String model) {
        super(speed, model);
    }
    void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int speed, String model) {
        super(speed, model);
    }
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}

public class VehicleHybridTest {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic");

        ev.charge();
        pv.refuel();
    }
}
