package com.tutorial;


public class Main {

    public static void main(String[] args){

        // Konversi Tipe Data Number

        int nilaiInt = 500; // 32-bit
        System.out.println("Nilai Integer = " + nilaiInt);
        System.out.println();

        // Memperluas Rentang ke lebih besar
        long nilaiLong = nilaiInt; // menjadi 64-bit
        System.out.println("Nilai Long = " + nilaiLong);
        System.out.println();

        // Memperluas Rentang ke lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai Byte = " + nilaiByte);
        System.out.println();


        // Casting Pembagian

            // Tanpa Casting
            float a = 20;
            int b = 6;

            float c = a/b;
            System.out.printf("%f / %d = %f\n",a,b,c); // %d adalah decimal, %f untuk float

            // Pakai Casting
            int x = 20;
            int y = 8;

            float z = (float) x/y;
            System.out.printf("%d / %d = %f \n",x,y,z);
    }

}
