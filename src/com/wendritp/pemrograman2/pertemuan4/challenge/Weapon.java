package com.wendritp.pemrograman2.pertemuan4.challenge;

public class Weapon extends Item{
    int damage;

    public Weapon(String name, int price, int damage) {
        super(name, price);
        this.damage = damage;
    }

    public void extraInfo() {
        System.out.println("Damage "+ damage);
    }
}
