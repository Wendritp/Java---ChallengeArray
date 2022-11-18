package com.wendritp.pemrograman2.pertemuan4.challenge;

public class Item {
    String name;
    int price;

    public Item(){

    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("Nama Item "+ name);
        System.out.println("Harga Item "+ price);

        extraInfo();
    }

    public void extraInfo(){

    }
}







