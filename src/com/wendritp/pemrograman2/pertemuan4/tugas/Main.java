package com.wendritp.pemrograman2.pertemuan4.tugas;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();

        System.out.println("Penghitung Luas dan Keliling Bangun Datar");
        System.out.println("Menu");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("");
        System.out.print("Masukkan Pilihan Nomor : ");
        int inputan = input.nextInt();

        if (inputan == 1) {
            System.out.print("Masukkan Sisi : ");
            int sisi = input.nextInt();
            Persegi pg = new Persegi(sisi);
            pg.hitungLuas();
            pg.hitungKeliling();
            pg.tampil();
        } else if (inputan == 2) {
            System.out.print("Masukkan Panjang : ");
            int panjang = input.nextInt();
            System.out.print("Masukkan Lebar : ");
            int lebar = input.nextInt();
            PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
            pp.hitungLuas();
            pp.hitungKeliling();
            pp.tampil();
        } else if(inputan == 3){
            System.out.print("Masukkan Alas : ");
            int alas = input.nextInt();
            System.out.print("Masukkan Tinggi : ");
            int tinggi = input.nextInt();
            Segitiga sg = new Segitiga(alas, tinggi);
            sg.hitungLuas();
            sg.hitungKeliling();
            sg.tampil();
        } else {
            System.out.println("Inputan Salah");
        }
    }
}
