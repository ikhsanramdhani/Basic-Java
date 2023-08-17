package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args){

        Scanner inputUser;
        float a,b,c,hasil;
        String opr;

        inputUser = new Scanner(System.in);

        System.out.println();
        System.out.println("Kalkulator Sederhana (Switch Case)");
        System.out.println("--------");
        System.out.println("( rules = nilai a > nilai b > nilai c ) \n~berurutan~");
        System.out.println();

        // Latihan Membuat Kalkulator Sederhana dengan Switch Case


        System.out.print("Masukan nilai a = ");
        a = inputUser.nextFloat();

        System.out.print("Masukan Operator (+,-,*,/) = ");
        opr = inputUser.next();

        System.out.print("Masukan nilai b = ");
        b = inputUser.nextFloat();

        System.out.println();

        switch (opr){
            case "+":
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("ERROR! Operator " + opr + " Tidak Ditemukan!");
        }

        System.out.println();
        System.out.println("--------");
        System.out.println("SELESAI");
    }


}
