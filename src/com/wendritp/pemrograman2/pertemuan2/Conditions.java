package com.wendritp.pemrograman2.pertemuan2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Bilangan ");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.println(bilangan + " Adalah Bilangan Positif");
        } else if (bilangan < 0) {
            System.out.println(bilangan + " Adalah Bilangan Negatif");
        } else {
            System.out.println(bilangan + " Adalah nol");
        }
    }
}
