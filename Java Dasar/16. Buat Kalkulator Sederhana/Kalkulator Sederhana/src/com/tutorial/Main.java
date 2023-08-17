package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args){

        // Nilai
        Scanner inputUser;
        float a,b,hasil1;
        char opr;


        // Membuat Kalkulator Sederhana
        System.out.println();
        System.out.println("Kalkulator Sederhana");
        System.out.println("- - - - - - ");
        System.out.println("Rules = nilai a > nilai b");
        System.out.println();

        // Input Nilai
        inputUser = new Scanner(System.in);

        System.out.print("Masukan nilai a = ");
        a = inputUser.nextFloat();

        System.out.print("Masukan Operator (+,-,*,/) = ");
        opr = inputUser.next().charAt(0);

        System.out.print("Masukan nilai b = ");
        b = inputUser.nextFloat();


        System.out.println();

        // Buat Operator ( + - / * )

        // opr
        if (opr == '+'){
            // penjumlahan
            hasil1 = a + b;
            System.out.println("Hasil = " + hasil1);
        } else if (opr == '-'){
            // pengurangan
            hasil1 = a - b;
            System.out.println("Hasil = " + hasil1);
        } else if (opr == '/'){
            // pembagian
            if (a == 0) {
                System.out.println("Pembagi nol menghasilkan tak hingga");
            } else if (b == 0) {
                System.out.println("Pembagi nol menghasilkan tak hingga");
            } else {
                hasil1 = a / b;
                System.out.println("Hasil = " + hasil1);
            }
        } else if (opr == '*'){
            // perkalian
            hasil1 = a * b;
            System.out.println("Hasil = " + hasil1);
        } else {
            System.out.println("ERROR! Operator Tidak Ditemukan");
        }

        System.out.println();
        System.out.println("--------");
        System.out.println("SELESAI");


    }

}
