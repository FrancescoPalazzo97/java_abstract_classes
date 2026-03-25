package org.lessons.java;

public class Ship {
    private String brand;
    private String model;
    private float length;
    private int power;
    private int remainingFuel;

    public Ship(String brand, String model, float length, int power, int remainingFuel) {
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.power = power;
        this.remainingFuel = remainingFuel;
    }

    public Ship(String brand, String model, int power) {
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

    public float getLenght() {
        return this.length;
    }

    public void setLenght(float length) {
        this.length = length;
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
        IO.println("This ship has been started!");
    }

    public void stop() {
        IO.println("This ship has been stopped!");
    }

    public void addFuel(int fuelQuantity) {
        remainingFuel += fuelQuantity;
    }

    public void navigate() {
        IO.println("This ship is navigating");
    }

    public void dock() {
        IO.println("This ship has been docked");
    }
}
