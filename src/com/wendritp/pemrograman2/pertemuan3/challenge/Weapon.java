package com.wendritp.pemrograman2.pertemuan3.challenge;

public class Weapon {
    String name;
    Float damage;

    public Weapon(String name, float damage) {
        this.name = name;
        this.damage = damage;
    }

    public void showInfo(){
        System.out.println("Weapon: " + name);
        System.out.println("Damage: " + damage);
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getDamage() {
        return damage;
    }

    public void setDamage(Float damage) {
        this.damage = damage;
    }

}
