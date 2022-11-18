package com.wendritp.pemrograman2.pertemuan4;

public class Main{
    public static void main(String[] args) {
        Mobil mb = new Mobil("Toyota", 2, 6, 4,"Bensin");
        Kendaraan kd = new Kendaraan("Kendaraan", 4, 4);


        mb.info();
        mb.nyalakanMesin();
        mb.belok("Kanan");
        mb.belok();

        kd.info();
        kd.nyalakanMesin();

    }
}
