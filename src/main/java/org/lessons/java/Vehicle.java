package org.lessons.java;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int power;
    protected int remainingFuel;

    public Vehicle(String brand, String model, int power, int remainingFuel) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.remainingFuel = remainingFuel;
    }

    public Vehicle(String brand, String model, int power) {
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

    public abstract void start();

    public abstract void stop();

    public void addFuel(int fuelQuantity) {
        this.remainingFuel += fuelQuantity;
    }
}
