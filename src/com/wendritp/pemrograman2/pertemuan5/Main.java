package com.wendritp.pemrograman2.pertemuan5;

import com.wendritp.pemrograman2.pertemuan4.tugas.BangunDatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Barang[] keranjang = new Barang[10];

        Barang[] etalase ={
            new Barang("Indomie", 2500),
            new Barang("Pensil", 1000),
            new Barang("Buku", 5000),
            new Barang("Pulpen", 2000),
            new Barang("Penghapus", 1000),
            new Barang("Penggaris", 2000)
        };


        // Menampilkan panjang array
        System.out.println("Jumlah Barang di etlase : " + etalase.length);

        System.out.println("=======Selamat Datang di Nani Store======");
        System.out.println("Menu Belanja : ");
        System.out.println("1. Masukkan Data Barang");
        System.out.println("2. Ayo Belanja dan Checkout");
        System.out.println("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        if(pilihan==1)
        {
            System.out.println("Masukkan Nama Barang : ");
            String namaBarang = input.next();
            System.out.println("Masukkan Harga Barang : ");
            int hargaBarang = input.nextInt();
        }
        else if(pilihan==2){
            Scanner inputan = new Scanner(System.in);
            //Menampilkan isi array
            System.out.println("Daftar Barang di etalase : ");
            int i = 1;
            //for each = perulangan dengan menggunakan sebuah object
            for (Barang b : etalase) {
                System.out.println("Barang ke-" + i);
                b.showInfo();
                i++;
            }

                System.out.println("Masukkan Barang yang ingin dibeli : ");
                String namaBarang = inputan.nextLine();
                System.out.println("Masukkan Jumlah Barang : ");
                int jumlahBarang = inputan.nextInt();

                //for each
                for (Barang b : etalase) {
                    if (b.getNama().equals(namaBarang)) {
                        keranjang[0] = new Barang(b.getNama(), b.getHarga() );
                        keranjang[0].getNama();
                        int harga = keranjang[0].getHarga();
                        int total = harga * jumlahBarang;
                        System.out.println("Barang yang dibeli : " + keranjang[0].getNama());
                        System.out.println("Total Harga : " + total);
                    }

                }
        }else {
            System.out.println("Pilihan tidak tersedia");
        }


    }
}
