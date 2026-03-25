package org.lessons.java;

public class Plane extends Vehicle {

    public Plane(String brand, String model, int power, int remainingFuel) {
        super(brand, model, power, remainingFuel);
    }

    public Plane(String brand, String model, int power) {
        super(brand, model, power);
    }

    @Override
    public void start() {
        IO.println("This plane has been started!");
    }

    @Override
    public void stop() {
        IO.println("This plane has been stopped!");
    }

    public void fly() {
        IO.println("This plane is flying");
    }

    public void land() {
        IO.println("This plane is landing");
    }
}
