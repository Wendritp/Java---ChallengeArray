package com.wendritp.pemrograman2.pertemuan4.challenge;

public class Player {
    String name;
    int hp;

    public Player() {
    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void showHud(){
        System.out.println("Nama Player "+ name);
        System.out.println("HP Player "+ hp);
        extraInfo();

    }

    public void extraInfo(){

    }
}




