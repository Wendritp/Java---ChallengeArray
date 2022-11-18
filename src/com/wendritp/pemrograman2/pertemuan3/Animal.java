package com.wendritp.pemrograman2.pertemuan3;

public class Animal {

        //Atrribute (variable)
        private String name;
        private int age;

        //Consturctor
        public Animal(){}

        //Cara Cepet alt+insert > Constructor
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

    //method
    public void showInfo() {
            System.out.println("Nama: " + name);
            System.out.println("Age: " + age +" Years Old");
            System.out.println();
        }

    //Cara Cepet alt+insert > Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

