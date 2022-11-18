package com.wendritp.pemrograman2.pertemuan4.tugas;

public class PersegiPanjang extends BangunDatar{
    int panjang;
    int lebar;
    int hasilkeliling;
    int hasilluas;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    float hitungLuas() {
        return hasilluas = panjang * lebar;
    }

    @Override
    float hitungKeliling() {
        return hasilkeliling = 2*(panjang+lebar);
    }

    void tampil(){
        System.out.println("Luas Persegi Panjang "+ hasilluas);
        System.out.println("Keliling Persegi Panjang "+ hasilkeliling);
    }
}

