package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("\nPengenalan String\n--------\n");

        String awal = "Hallo Cucu Adam";
        char[] awalChar = {'h','a','l','l','o'};
        System.out.println(awal);
        System.out.println(Arrays.toString(awalChar));

        // untuk mengetahui index String
            // jika pada array
        System.out.println("\nindex 0 pada Array = " + awalChar[0]);
            // jika pada string [ use namaString.charAt(index) ]
        System.out.println("index 0 pada String = " + awal.charAt(0));

        // mengubah komponen index pada String
            // jika pada array
        awalChar[0] = 'y';
        System.out.println("\n" + Arrays.toString(awalChar));
        // awal[0] = "y"   --> Tidak Bisa
        // awal.charAt(0) = "y"   --> Tidak Bisa

            /*  jika pada String itu tidak bisa. Kenapa?
                Karena String di java itu bersifat immutable (tak dapat diubah) */
        printAddress("awal sebelum substring", awal);
            // namun kita bisa merubah komponen String secara tidak langsung
        awal = awal.substring(1,15); // namaString.substring(index awal, ke index akhir)
        System.out.println(awal);

        // Mengetahui memory address String (termasuk ke jenis memori String Pool)
        printAddress("awal sesudah substring",awal);

            /*  Kenapa address memori sebelum substring dan sesudah itu berbeda?
                Karena, substring itu mengubah index dan membuat index barunya
            */
        System.out.println();

        String kataSatu = "hai";
        String kataDua = "hai";

        printAddress("kataSatu", kataSatu);
        printAddress("kataDua", kataDua);

        // Kenapa Sama? Karena outputnya juga sama. Gapercaya? Oke kita buat yang bedanya
        String kataTiga ="Hai";
        printAddress("kataTiga", kataTiga); // padahal hanya berbeda huruf satu kapitalnya saja


        /*  Kesimpulan :

                1. String di java itu immutable (tidak bisa diubah)
                2. String yang berada di StringPool itu aka reusable,
                   memory nya lebih efisien.
                3. Membuat String dengan method baru, maka dia akan ditaruh di memory lain,
                   bukan di StringPool

        */
    }

    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
