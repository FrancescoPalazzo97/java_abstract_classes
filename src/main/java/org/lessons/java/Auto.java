package org.lessons.java;

import org.lessons.java.interfaces.Truckable;

public class Auto extends Vehicle implements Truckable {

    public Auto(String brand, String model, int power, int remainingFuel) {
        super(brand, model, power, remainingFuel);
    }

    public Auto(String brand, String model, int power) {
        super(brand, model, power);
    }

    @Override
    public void start() {
        IO.println("This car has benn started!");
    }

    @Override
    public void stop() {
        IO.println("This car has been stopped!");
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
