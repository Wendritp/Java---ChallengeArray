package com.wendritp.pemrograman2.pertemuan3.tugas;

public class Bus {
    String brand;
    String type;
    int wheels;
    int maxSpeed;
    int maxPassenger;

    public Bus(String brand, String type, int wheels, int maxSpeed, int maxPassenger) {
        this.brand = brand;
        this.type = type;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.maxPassenger = maxPassenger;
    }

    public void busShowInfo(){
        System.out.println("============Bus==========");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Wheels: " + wheels);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Max Passenger: " + maxPassenger);
        System.out.println();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
}

