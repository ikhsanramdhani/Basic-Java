package com.tutorial;


public class Main {

    public static void main(String[] args) {

        // Tipe Data Primitive di Java

        /* Tipe Data Primitive ada 8, yaitu :

            1. integer
            2. byte
            3. short
            4. long
            5. float
            6. double
            7. boolean
            8. char

           Masing-masing tipe data, memiliki size(nilai Min dan Max) yang berbeda beda
        */

        // Integer
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("Nilai integer i = " + i);
        System.out.println("Min nilai integer = " + Integer.MIN_VALUE);
        System.out.println("Max nilai integer = " + Integer.MAX_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar Integer = " + Integer.SIZE + " bit");
        System.out.println();

        // Byte
        byte b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("Nilai Byte b = " + b);
        System.out.println("Min nilai byte = " + Byte.MIN_VALUE);
        System.out.println("Max nilai byte = " + Byte.MAX_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");
        System.out.println();

        // Short
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("Nilai short s = " + s);
        System.out.println("Min nilai short = " + Short.MIN_VALUE);
        System.out.println("Max nilai short = " + Short.MAX_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " bytes");
        System.out.println("Besar Short = " + Short.SIZE + " bit");
        System.out.println();

        // Long
        long l = 10L; // untuk menandai bahwa ini tipe Long harus ditambah L
        System.out.println("=====LONG=====");
        System.out.println("Nilai long l = " + l);
        System.out.println("Min nilai long = " + Long.MIN_VALUE);
        System.out.println("Max nilai long = " + Long.MAX_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " bytes");
        System.out.println("Besar Long = " + Long.SIZE + " bit");
        System.out.println();

        // Double (Decimal)
        double d = 10.8d; // untuk menandai bahwa ini double, agar tidak disamakan dengan float
        System.out.println("=====DOUBLE=====");
        System.out.println("Nilai double d = " + d);
        System.out.println("Min nilai double = " + Double.MIN_VALUE);
        System.out.println("Max nilai double = " + Double.MAX_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Double = " + Double.SIZE + " bit");
        System.out.println();

        // Float (Decimal)
        float f = -9.3f; // untuk menandai bahwa ini adalah float, ditambah f dibelakang nilainya
        System.out.println("=====FLOAT=====");
        System.out.println("Nilai float f = " + f);
        System.out.println("Min nilai float = " + Float.MIN_VALUE);
        System.out.println("Max nilai float = " + Float.MAX_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " bytes");
        System.out.println("Besar Float = " + Float.SIZE + " bit");
        System.out.println();

        // Jika ke empat diatas adalah berbentuk angka, maka char dan boolean adalah sbb :

        // Char (Character, seperti pilihan ganda) berdasarkan ASCII
        char c = 'A'; // harus dengan ''(kutip satu)
        System.out.println("=====CHAR=====");
        System.out.println("Nilai char c = " + c);
        System.out.println("Min nilai char = " + Character.MIN_VALUE);
        System.out.println("Max nilai char = " + Character.MAX_VALUE);
        System.out.println("Besar Char = " + Character.BYTES + " bytes");
        System.out.println("Besar Char = " + Character.SIZE + " bit");
        System.out.println();

        // Boolean (True or False)
        boolean bool = true;
        System.out.println("=====BOOLEAN=====");
        System.out.println("Nilai boolean bool = " + bool);
        // Boolean tidak punya nilai min dan max nya, hanya ada true dan false



    }

}
