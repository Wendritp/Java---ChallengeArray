package com.wendritp.pemrograman2.pertemuan4.tugas;

public class Persegi extends BangunDatar{
    int sisi;
    int hasilkeliling;
    int hasilluas;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    float hitungLuas() {
        return hasilluas = sisi * sisi;
    }

    @Override
    float hitungKeliling() {

        return hasilkeliling = 4*sisi;
    }

    void tampil(){
        System.out.println("Luas Persegi "+ hasilluas);
        System.out.println("Keliling Persegi "+ hasilkeliling);
    }
}
