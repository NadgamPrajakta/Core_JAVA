package MethodOverriding;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class ElectricCar extends Vehicle {
    @Override
    void start() {
        System.out.println("Electric Car starts with a button.");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new ElectricCar();

        v1.start();
        v2.start();
        v3.start();
    }
}
