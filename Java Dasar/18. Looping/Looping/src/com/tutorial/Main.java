package com.tutorial;

public class Main {

    public static void main(String[] args){

        System.out.println();
        System.out.println("Macam-macam Looping : \n--------");
        // Loop

        /*  Looping (Perulangan) pada dasarnya dibagi 3 yaitu :
                1. While Loop
                2. Do While
                3. For
        */


        // 1. While Loop

        /*  While Loop Strukturnya begini,

                while (kondisi){
                    disini ekspresi
                }

        */

        System.out.println();
        System.out.println("1. While Loop");
        System.out.println("--------");
        System.out.println();

        int a = 0;

        while (a <= 10) {
            System.out.println("While Loop ke-"+ a);
            a++; // increment
        }


        System.out.println();

        System.out.println("2. Do While");
        System.out.println("--------\n");

        // 2. Do While

        /*  Struktur Do While begini,

                do {
                    disini ekspresi / aksi
                }
                while (kondisi);

        */

        a = 1;

        do {
            System.out.println("Ini adalah Do While ke-" + a);
            a++;
            if (a == 4) {
                System.out.println("Ini adalah Do While Terakhir");
            } 
        } while (a < 4);

        System.out.println();

        System.out.println("3. For");
        System.out.println("--------\n");

        // 3. For Loop

        /*  Struktur For Loop begini,

        for (inisial;kondisi;decreement/increement) {
            disini aksi / ekspresi
        }

        */

        for (int i = 0; i < 8; i++) {
            System.out.println("Ini adalah For Loop ke-" + i);
        }


            // 3.1 For Each
        System.out.println("\n3.1 For Each\n--------");
        /*  Strukturnya Begini,

            for (type variableName : arrayName) {
                ini adalah aksi
            }

         */

        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        for (String i : days) {
            System.out.println("Ini adalah hari " + i);
        }


        System.out.println();
        System.out.println("--------");
        System.out.println("SELESAI");

    }

}
