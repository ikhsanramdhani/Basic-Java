package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // If Statement = Percabangan

        /* If Statement terdiri dari beberapa bentuk, yaitu sbb :

            1. If Else
            2. If Else Kompleks
            3. Nested If Else / If Else Bersarang
            4. Ternary Operator

        */

        System.out.println();
        System.out.println("If Else");
        System.out.println("--------");

        // If Else

        /* Cara membuat if else sebagai berikut :

        if (kondisi) {
            disini adalah aksi / ekspresi yang menghasilkan nilai true
        } else {
            jika false, akan masuk kedalam else
        }

        */

        System.out.println("Ini adalah awal If Else");
        int a,b,c;
        a = 3;
        b = 4;
        c = 7;

        if (a < b) {
            System.out.println("Ini adalah if");
        } else {
            System.out.println("Ini adalah else");
        }

        System.out.println("Ini adalah akhir If Else");

        // If Else kompleks

        /* if else if adalah bentuk if statement yang lebih kompleks, else if bisa berapapun

            berikut bentuknya :

            if(kondisi) {
                disini ekspresi
            } else if(kondisi 2) {
                disini ekspresi 2
            } else {
                akhir ekspresi
            }

        */
        System.out.println();
        System.out.println("If Else Kompleks");
        System.out.println("--------");

        a = 2;
        b += a;
        c = 5;

        System.out.println("Ini adalah awal If Else Kompleks");
        if (a == b) {
            System.out.println("Ini adalah if");
        } else if ( a <= c) {
            System.out.println("Ini adalah else if");
        } else if (b > a) {
            System.out.println("Ini adalah else if ke-2");
        } else {
            System.out.println("Ini adalah end else");
        }

        /* Kesimpulan If Else Kompleks

        Kenapa else if kedua tidak ditampilkan?
        Karena di eksekusi dari atas ke bawah, jadi else if pertama saja yang ditampilkan

        */
        System.out.println("Ini adalah Akhir If Else Kompleks");
        System.out.println();


        // Nested If Else / If Bersarang

        /*  adalah if else didalam if else

        contoh bentuknya sbb :

            if (kondisi 1) {
                if (kondisi 2) {

                } else if (kondisi 3) {

                } else {

                }
            } else if (kondisi 4) {
                if (kondisi 5) {

                } else {

                }
            } else {

            }

        */

        System.out.println("Nested If Else");
        System.out.println("--------");
        System.out.println("Ini adalah awal Nested If Else");

        a = 5;
        b = 10;

        if (a == 5) {
            if ( b == 10 ) {
                System.out.println("Ini adalah ekspresi\ndimana a = 5 dan b = 10"); // ini hasilnya
            } else if (a > 10) {
                System.out.println("Ini adalah ekspresi else if\ndimana a > 10");
            } else {
                System.out.println("Ini adalah ekspresi else\ndimana a dan b itu salah");
            }
        } else {
            System.out.println("Ini adalah ekspresi else utama\ndimana a dan b tidak sesuai");
        }

        System.out.println("Ini adalah akhir Nested If Else");
        System.out.println();


        // Ternary Operator (Short Hand If Statement)

        /* Ternary Operator adalah if statement yang lebih simple, berikut bentuknya :

            variable = (kondisi) ? ekspresiTrue : ekspresiFalse;

        */
        System.out.println("Ternary Operator");
        System.out.println("--------");
        System.out.println("Ini adalah awal Ternary Operator");

        int d = 10;
        String ternaryOperator = (d != 9) ? "Ini adalah Ternary True" : "Ini adalah Ternary False";
        System.out.println(ternaryOperator);

        System.out.println("Ini adalah akhir Ternary Operator");

        System.out.println();
        System.out.println("----------");
        System.out.println("SELESAI");
    }
}
