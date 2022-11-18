package com.wendritp.pemrograman2.pertemuan3;

public class Main {

    public static void main(String[] args) {
        //pembuatan objek dari class animal
        Animal pig = new Animal("Caca",2);
        Animal horse = new Animal("Lala", 4);
        Animal dog = new Animal("Lolo", 8);

        //Menjalankan method
        pig.showInfo();
        horse.showInfo();
        dog.showInfo();

        //Uji Coba privat/public
        System.out.println("Usia "+dog.getName() + " adalah "+dog.getAge() +"tahun");

        dog.setAge(46);
        System.out.println("Usia "+dog.getName() + " adalah "+dog.getAge() +"tahun");
    }
}





// public static void main(String[] args) {
//        //pembuatan class
//        Animal cat = new Animal();
//        Animal dog = new Animal();
//        Animal pig = new Animal();
//
//        //mengisi nilai attribute
//        cat.setName("Caca");
//        cat.setAge(2);
//
//        dog.setName("Lala");
//        dog.setAge(4);
//
//        pig.setName("Lolo");
//        pig.setAge(8);
//    }