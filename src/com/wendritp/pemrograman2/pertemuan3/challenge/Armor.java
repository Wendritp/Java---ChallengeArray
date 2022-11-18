package com.wendritp.pemrograman2.pertemuan3.challenge;

public class Armor {

    String name;
    float protection;


    public Armor(String name, float protection) {
        this.name = name;
        this.protection = protection;
    }

    public void showInfo(){
        System.out.println("Protection: " + name);
        System.out.println("Reduction: " + protection);
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getProtection() {
        return protection;
    }

    public void setProtection(float protection) {
        this.protection = protection;
    }
}


