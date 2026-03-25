package org.lessons.java;

public class Ship extends Vehicle {
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
}
