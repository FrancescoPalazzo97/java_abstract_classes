package org.lessons.java;

public class Auto extends Vehicle {

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

}
