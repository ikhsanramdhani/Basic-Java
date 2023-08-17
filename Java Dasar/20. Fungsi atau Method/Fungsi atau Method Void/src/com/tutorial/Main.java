package com.tutorial;
import java.util.*;
public class Main {

    static void myMethod() {
        System.out.println("Annyeoung, ini adalah myMethod()");
    }

    /*  myMethod() itu nama methodnya
        static berarti metode tersebut milik kelas Utama dan bukan objek dari kelas Utama.
        void berarti metode ini tidak memiliki nilai balik.
    */


    public static void main(String[] args) {
        System.out.println();

        myMethod(); // memanggil method nya
        goodNight("Ikhsan");
        System.out.println(numFloat() + " = ini adalah method dgn kembalian");

        Scanner inputUser = new Scanner(System.in);

        // Latihan Fungsi
        System.out.println("\nLatihan Fungsi\n--------\n");
        System.out.println("Membuat Persegi Panjang \n");

        System.out.print("Masukan Panjang = ");
        int inputPjg = inputUser.nextInt();
        System.out.print("Masukan Lebar = ");
        int inputLbr = inputUser.nextInt();

        persegiPanjang(inputPjg, inputLbr);
        System.out.println();

        tampilkanLuasDanKeliling(inputPjg,inputLbr);

    }


    // Method tanpa kembalian
    private static void goodNight(String nama) {
        System.out.println("Good Night " + nama);
    }


    // Method dengan kembalian,
    // yaitu method yang menggunakan return untuk mengembalikan nilainya, sbb contoh :

    private static float numFloat() {
        return 10.98f;
    }


    // Latihan
     static void persegiPanjang(int p, int l) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static int luas(int a, int b) {
       int hasil = a * b;
       return hasil;
    }

    private static int keliling(int a,int b) {
        int hasil = (a + b) * 2;
        return hasil;
    }

    private static void tampilkanLuasDanKeliling(int l, int k) {
        System.out.println("\nLuas = " + luas(l,k));
        System.out.println("Keliling = " + keliling(l,k));
    }
}
