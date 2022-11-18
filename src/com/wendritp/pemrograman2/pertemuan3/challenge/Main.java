package com.wendritp.pemrograman2.pertemuan3.challenge;

public class Main {
    public static void main(String[] args) {
        Hero babayo = new Hero("Lala", 5000);
        Weapon pedang = new Weapon("Pedang", 1000);
        Armor bajuBesi = new Armor("Baju Besi", 1000);


        babayo.showInfo();
        System.out.println("Attack Use Weapon: " + pedang.getName()+ " With Damage: " + pedang.getDamage());
        System.out.println("Wear Armor: " + bajuBesi.getName()+ " With Damage Reduction: " + bajuBesi.getProtection());

    }
}
