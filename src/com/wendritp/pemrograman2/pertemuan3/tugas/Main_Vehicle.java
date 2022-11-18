package com.wendritp.pemrograman2.pertemuan3.tugas;

public class Main_Vehicle {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Avanza", "Silver", 2015, 180);
        Car car2 = new Car("Honda", "Jazz", "Red", 2017, 200);
        Car car3 = new Car("Suzuki", "APV", "Black", 2018, 190);
        Truck truck1 = new Truck("Isuzu", "Elf", 8, 150, 1000);
        Truck truck2 = new Truck("Mitsubishi", "Fuso",  8, 160, 1500);
        Bus bus1 = new Bus("Mercedes", "Benz", 8, 150, 50);
        Bus bus2 = new Bus("Suzuki", "APV", 8, 150, 20);

        car1.carShowInfo();
        car2.carShowInfo();
        car3.carShowInfo();
        truck1.truckShowInfo();
        truck2.truckShowInfo();
        bus1.busShowInfo();
        bus2.busShowInfo();

    }
}
