package com.wendritp.pemrograman2.pertemuan4.challenge;

import com.wendritp.pemrograman2.pertemuan3.challenge.Weapon;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Wendri", 1000);
        Item item = new Item("Potion", 100);
        potion potion = new potion("Potion", 100, 100);
        Weapon weapon = new Weapon("Pedang", 100);

        player.showHud();
        item.showInfo();
        potion.showInfo();
        weapon.showInfo();


    }
}
