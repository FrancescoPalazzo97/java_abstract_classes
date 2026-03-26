package org.lessons.java;

import org.lessons.java.interfaces.Truckable;

public class Plane extends Vehicle implements Truckable {

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

    @Override
    public float getShippableWeight() {
        return 0;
    }

    @Override
    public float getShippableLength() {
        return 0;
    }

    @Override
    public float getShippableWidth() {
        return 0;
    }

    @Override
    public float getShippableHeight() {
        return 0;
    }

    @Override
    public boolean isFragile() {
        return false;
    }

    @Override
    public boolean isWheeled() {
        return false;
    }
}
