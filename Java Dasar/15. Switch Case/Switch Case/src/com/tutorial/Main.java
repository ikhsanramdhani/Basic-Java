package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args){

        // Switch Case

        /* Switch Case itu sama seperti If Statement, namun ekspresi pada switch case lebih banyak
        bisa semua tipe data angka, String, bahkan enum.

        Sedangkan, If Statement ekspresinya hanya berlaku untuk boolean saja.


        Struktur Switch sbb :

            Switch (ekspresi) {
                case 1:
                    // statement
                    break;
                case 2:
                    // statement
                    break;
                case 3:
                    // statement
                    break;
                default:
                    // statement
                    break;
            }

            (banyaknya case bebas, seperti else if)
        */
        System.out.println();
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Switch Case");
        System.out.println("========");
        System.out.println("Latihan Switch Case");
        System.out.println();

        System.out.println("1. Switch Day");
        System.out.println("--------");
        System.out.println("Ini adalah awal Switch Day");
        System.out.println();

        System.out.printf("Masukan Angka 1 - 7 = ");
        int day = inputUser.nextInt();
        switch (day) {
            case 1:
                System.out.println("Hari ke-" + day + " adalah hari Senin");
                break;
            case 2:
                System.out.println("Hari ke-" + day + " adalah hari Selasa");
                break;
            case 3:
                System.out.println("Hari ke-" + day + " adalah hari Rabu");
                break;
            case 4:
                System.out.println("Hari ke-" + day + " adalah hari Kamis");
                break;
            case 5:
                System.out.println("Hari ke-" + day + " adalah hari Jumat");
                break;
            case 6:
                System.out.println("Hari ke-" + day + " adalah hari Sabtu");
                break;
            case 7:
                System.out.println("Hari ke-" + day + " adalah hari Minggu");
                break;
        } // hasilnya case 5
        System.out.println();

        System.out.println("Ini adalah akhir Switch Day");
        System.out.println();

        // Buat Switch panggil nama

        System.out.println("2. Switch Panggil Nama");
        System.out.println("--------");
        System.out.println("Awal Switch Panggil Nama");
        System.out.println();

        System.out.print("Panggil Nama (joko,dea,wendi,abdul) = ");
        String nama = inputUser.next();
        switch (nama) {
            case "joko":
                System.out.println("SIAP! Joko hadir pak!");
                break;
            case "dea":
                System.out.println("SIAP! Dea hadir pak!");
                break;
            case "wendi":
                System.out.println("SIAP! Wendi hadir pak!");
                break;
            case "abdul":
                System.out.println("SIAP! Abdul hadir pak!");
                break;
            default:
                System.out.println("SIAP! " + nama + " tidak hadir pak");
                break;
        }
        System.out.println();
        System.out.println("Akhir Switch Panggil Nama");



    }

}
