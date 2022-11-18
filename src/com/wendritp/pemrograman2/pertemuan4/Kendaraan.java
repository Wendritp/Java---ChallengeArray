package com.wendritp.pemrograman2.pertemuan4;

public class Kendaraan {
    String nama;
    int roda;
    int penumpang;

    public Kendaraan(String nama, int roda, int penumpang) {
        this.nama = nama;
        this.roda = roda;
        this.penumpang = penumpang;
    }

    public void nyalakanMesin(){
        System.out.println("Mesin Kendaraan " +nama+ "dinyalakan!");
    }

    public void info(){
        System.out.println("Nama Kendaraan "+ nama);
        System.out.println("Jumlah Roda "+ roda);
        System.out.println("Jumlah Penumpang "+ penumpang);
    }

}
