package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // Operator Komparasi adalah operator yang menghasilkan nilai boolean

        /* Operator Komparasi ada 6 bentuk, yaitu :
            1. Equal atau Persamaan (==)
            2. Not Equal atau PerTidaksamaan (!=)
            3. Less atau Kurang Dari (<)
            4. Greater atau Lebih Dari (>)
            5. Less than equal atau Kurang Dari (<=)
            6. Greater than equal atau Lebih Dari (>=)

        */

        // Equal atau Persamaan
        int a = 10;
        int b = 10;
        System.out.println("----Equal atau Persamaan----");
        System.out.println("Nilai Equal a dan b hasilnya = " + (a == b) ); // true
        System.out.println();

        // Not Equal atau PerTidaksamaan
        System.out.println("----Not Equal atau PerTidaksamaan----");
        System.out.println("Nilai Not Equal a dan b hasilnya = " + (a != b)); // false
        System.out.println();

        // Less atau Kurang Dari
        System.out.println("----Less atau Kurang Dari----");
        System.out.println("Nilai Less a dan b hasilnya = " + (a < b)); // false
        System.out.println();

        // Greater atau Lebih Dari
        System.out.println("----Greater atau Lebih Dari----");
        System.out.println("Nilai Greater a dan b hasilnya = " + (a > b)); // false
        System.out.println();

        // Less than equal atau Kurang Dari Sama Dengan
        System.out.println("----Less than equal atau Kurang Dari sama dengan----");
        System.out.println("Nilai Less than equal a dan b hasilnya = " + (a <= b)); // true
        System.out.println();

        // Greater than equal atau Lebih Dari Sama Dengan
        System.out.println("----Greater than equal atau Lebih Dari sama dengan----");
        System.out.println("Nilai Greater than equal a dan b hasilnya = " + (a >= b)); // true
        System.out.println();


        // Namun penulisan yang benar seperti ini,

        int x = 10;
        int y = 25;

        boolean hasil = (x <= y);
        System.out.println(hasil);


    }

}
