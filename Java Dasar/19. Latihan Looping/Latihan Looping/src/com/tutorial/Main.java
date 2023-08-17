package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        System.out.println("\nPenjumlahan dengan rentang\n--------");

        int nAwal,nAkhir,total;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan Nilai Awal = ");
        nAwal = inputUser.nextInt();
        System.out.print("Masukan Nilai Akhir = ");
        nAkhir = inputUser.nextInt();

        total = 0;
        System.out.println();

        while ( nAwal <= nAkhir) {
            total += nAwal;
            System.out.println("ditambah " + nAwal + " menjadi = " + total);
            nAwal++;
        }

        // Fibonacci

        System.out.println("\n--------\nMenghitung Deret Fibonacci ke-n\n--------");
        // fn1 = Fn-1, fn2 = Fn-2
        int n,fn,fn1,fn2;

        System.out.print("Masukan nilai fibonacci ke - : ");
        n = inputUser.nextInt();

        fn = 1;
        fn2 = 0;
        fn1 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("nilai ke - " + i + " adalah = " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }

    }
}



