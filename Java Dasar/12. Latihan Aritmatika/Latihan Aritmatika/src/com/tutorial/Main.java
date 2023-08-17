package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        // Menghitung luas dan volume persegi panjang
        /*
                luas = panjang * lebar = ... cm^2
                volume = luas * tinggi = ... cm^3
        */

        System.out.println();
        System.out.println("Menghitung luas persegi panjang");
        System.out.println("------------------");
        System.out.println("( bisa langsung input 2 angka : p (space) l )");
        System.out.println();

        int p,l,luas,t,v;

        System.out.print("Masukan Panjang Persegi Panjang = ");
        p = (int) inputUser.nextInt();
        System.out.println();

        System.out.print("Masukan Lebar Persegi Panjang = ");
        l = (int) inputUser.nextInt();
        System.out.println();

        System.out.println("p = " + p + " cm");
        System.out.println("l = " + l + " cm");
        System.out.println();

        luas = p * l;
        System.out.println("Luas = p x l");
        System.out.println("Luas = " + p + " x " + l + " = " + luas + " cm^2");
        System.out.println();
        System.out.println("Jadi, Luas Persegi Panjang \nyang kamu masukan adalah = " + luas + " cm^2");
        System.out.println();

        System.out.println("Menghitung Volume Persegi Panjang");
        System.out.println("------------------");
        System.out.println();

        System.out.print("Masukan Tinggi Persegi Panjang = ");
        t = inputUser.nextInt();
        System.out.println("t = " + t + " cm");
        System.out.println();

        v = luas * t;
        System.out.println("Volume = luas x t");
        System.out.println("Volume = " + luas + " cm^2" + " x " + t + " cm" + " = " + v + " cm^3");
        System.out.println();
        System.out.println("Jadi, Volume Persegi Panjang \nyang kamu masukan adalah = " + v + " cm^3");

        System.out.println();
        System.out.println("------------------");
        System.out.println("SELESAI");
    }

}
