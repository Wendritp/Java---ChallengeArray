package com.wendritp.pemrograman2.pertemuan5;

public class Challenge {
    public static void main(String[] args) {

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

        //Menampilkan isi array
        System.out.println("Daftar Barang di etalase : ");
        int i = 1;

        //for each = perulangan dengan menggunakan sebuah object
        for (Barang b : etalase) {
            System.out.println("Barang ke-" + i);
            b.showInfo();
            i++;
        }

        //for biasa
        for (int j = 0; j < etalase.length; j++) {
            System.out.println("Barang ke-" + (j+1));
            etalase[j].showInfo();
        }
    }
}
