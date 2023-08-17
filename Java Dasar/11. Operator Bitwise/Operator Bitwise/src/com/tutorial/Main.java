package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Operator Bitwise = adalah operator yang dilakukan pada tipe data bit / nilai bit.
        System.out.println("Operator Bitwise");
        System.out.println("Bentuk Operator Bitwise sbb : ");
        System.out.println();

        /* Cara menghitung type data bit yaitu = 2^7 + 2^6 + 2^5 + 2^4 + 2^3 + 2^2 + 2^1 + 2^0 ( ^ adalah pangkat )

         Misalnya, 0 = 00000000
                   1 = 0000000+2^0 = 1 (00000001)
                   2 = 000000+2^1+0 = 2 (00000010)
                   3 = 000000 + 2^1 + 2^0 = 3 (00000011)
                   4 = 00000 + 2^2 + 0 + 0 = 4 (00000100),

          dst...
        */

        /* Operator Bitwise terdapat beberapa bentuk, yaitu :
            1. Operator Shift Left (<<)
            2. Operator Shift Right (>>)
            3. Operator OR Bitwise (|)
            4. Operator AND Bitwise (&)
            5. Operator XOR Bitwise (^)
            6. Operator NOT Bitwise (~)
        */

        byte a,b,c;
        String a_bits,b_bits,c_bits;


        // Operator Shift Left (<<)
        System.out.println("=== Operator Shift Left (<<) ===");
            // Tanpa Shift Left
        a = 6;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
            // Use Shift Left
        b = (byte)(a << 3); // Geser ke kiri tiga kali ( 0 nya yang digeser )
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);

        System.out.println();

        // Operator Shift Right (>>)
        System.out.println("=== Operator Shift Right (>>) ===");
            // Tanpa Shift Right
        a = 48;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
            // Use Shift Right
        b = (byte)(a >> 2); // Geser ke kanan tiga kali
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);

        System.out.println();

        // Operator OR Bitwise (|)
        System.out.println("=== Operator OR Bitwise (|) ===");
            // Tanpa OR Bitwise
        a = 48;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);
            // Use OR Bitwise
        System.out.println("--- USE OR (HASIL) ---"); // digabungkan semua 1 nya
        c = (byte)(a | b); //
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits, c);

        System.out.println();

        // Operator AND Bitwise (&)
        System.out.println("=== Operator AND Bitwise (&) ===");
            // Tanpa AND Bitwise
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);
            // Use AND Bitwise
        System.out.println("--- USE AND (HASIL) ---"); // 1 yang sama saja yang dihasilkan
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits, c);

        System.out.println();

        // Operator XOR Bitwise (^)
        System.out.println("=== Operator XOR Bitwise (^) ===");
            // Tanpa XOR Bitwise
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits, b);
            // Use XOR Bitwise
        System.out.println("--- USE XOR (HASIL) ---"); // 1 yang sama akan dijadikan 0
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits, c);

        System.out.println();

        // Operator NOT Bitwise (~)
        System.out.println("=== Operator NOT Bitwise (~) ===");
            // Tanpa NOT Bitwise
        a = 20;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
            // Use NOT Bitwise
        System.out.println("--- USE NOT (HASIL) ---"); // kebalikan nya
        b = (byte) (~a);
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n", b_bits, b);
        
    }


}
