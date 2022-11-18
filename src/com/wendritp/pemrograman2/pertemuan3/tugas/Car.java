package com.wendritp.pemrograman2.pertemuan3.tugas;

public class Car {
    String brand;
    String type;
    String color;
    int year;
    int maxSpeed;

    public Car(String brand, String type, String color, int year, int maxSpeed) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void carShowInfo(){
        System.out.println("============Car==========");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Max Speed: " + maxSpeed);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
