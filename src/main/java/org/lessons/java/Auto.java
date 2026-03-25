package org.lessons.java;

public class Auto {
    private String brand;
    private String model;
    private int power;
    private int remainingFuel;

    public Auto(String brand, String model, int power, int remainingFuel) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.remainingFuel = remainingFuel;
    }

    public Auto(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.remainingFuel = 0;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBreand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void start() {
        IO.println("This car has benn started!");
    }

    public void stop() {
        IO.println("This car has been stopped!");
    }

    public void addFuel(int fuelQuantity) {
        remainingFuel += fuelQuantity;
    }
}
