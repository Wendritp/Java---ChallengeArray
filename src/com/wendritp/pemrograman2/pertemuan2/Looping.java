package com.wendritp.pemrograman2.pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println("Looping........ ("+i+ ")");
        }
        System.out.println("looping For Selesai \n");

        int j=1;
        while (j<=100){
            System.out.println("Looping........ ("+j+ ")");
            j+= 10;

            if (j ==51){
                System.out.println("Udah Bang, Capek!");
                break;
            }
        }
        System.out.println("Looping While Selesai \n");

        int k=10;
        do{
            System.out.println("Looping........ ("+k+ ")");
            k--;
        }while (k>0);
            System.out.println("Looping Do While Selesai \n");

    }
}
