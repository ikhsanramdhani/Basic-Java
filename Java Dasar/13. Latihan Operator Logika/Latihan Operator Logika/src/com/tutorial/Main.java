package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        // Membuat Tebak Angka dengan Operator Logika

        int a;
        boolean status;

        Scanner inputUser = new Scanner(System.in);
        System.out.println();

        System.out.println("Tebak Angka Operator Logika");
        System.out.println("--------");
        System.out.println();

        System.out.print("Masukan Angka diantara 2 - 9 = ");
        a = inputUser.nextInt();
        System.out.println("Angka anda adalah = " + a);
        System.out.println();

        status = (a > 2 && a<9);
        System.out.println("Hasil Tebakan adalah = " + status);

    }
}
