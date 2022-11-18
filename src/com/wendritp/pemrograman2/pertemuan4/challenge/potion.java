package com.wendritp.pemrograman2.pertemuan4.challenge;

public class potion extends Item{
    int heal;

    public potion(String name, int price, int heal) {
        super(name, price);
        this.heal = heal;
    }

    public void extraInfo() {
        System.out.println("Heal "+ heal);
    }
}
