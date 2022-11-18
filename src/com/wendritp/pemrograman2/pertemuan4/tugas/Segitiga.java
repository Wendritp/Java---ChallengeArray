package com.wendritp.pemrograman2.pertemuan4.tugas;

public class Segitiga {
    int alas;
    int tinggi;
    int hasilkeliling;
    int hasilluas;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    float hitungLuas() {
        return hasilluas = (alas * tinggi)/2;
    }

    float hitungKeliling() {
        return hasilkeliling = 3*alas;
    }

    void tampil(){
        System.out.println("Luas Segitiga "+ hasilluas);
        System.out.println("Keliling Segitiga "+ hasilkeliling);
    }
}
