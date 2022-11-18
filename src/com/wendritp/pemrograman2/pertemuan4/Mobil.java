package com.wendritp.pemrograman2.pertemuan4;

public class Mobil extends Kendaraan {

    int jmlPintu;
    String jenisBahanBakar;


    public Mobil(String nama, int roda, int penumpang, int jmlPintu, String jenisBahanBakar) {
        super(nama, roda, penumpang);
        this.jmlPintu = jmlPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void belok(String arah){
        System.out.println("Mobil " +nama + "belok ke "+arah+ "!");
    }

    public void belok(){
        System.out.println("Harap masukkan arah belok!");
    }

    public void extraInfo(){
        System.out.println("Jumlah Pintu "+ jmlPintu);
        System.out.println("Jenis Bahan Bakar "+ jenisBahanBakar);
    }
}
