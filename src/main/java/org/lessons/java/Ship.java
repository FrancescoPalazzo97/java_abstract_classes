package org.lessons.java;

import org.lessons.java.interfaces.Truckable;

public class Ship extends Vehicle implements Truckable {
    private float length;

    public Ship(String brand, String model, float length, int power, int remainingFuel) {
        super(brand, model, power, remainingFuel);
        this.length = length;
    }

    public Ship(String brand, String model, float length, int power) {
        super(brand, model, power);
        this.length = length;
    }

    public float getLenght() {
        return this.length;
    }

    public void setLenght(float length) {
        this.length = length;
    }

    @Override
    public void start() {
        IO.println("This ship has been started!");
    }

    @Override
    public void stop() {
        IO.println("This ship has been stopped!");
    }

    public void navigate() {
        IO.println("This ship is navigating");
    }

    public void dock() {
        IO.println("This ship has been docked");
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
