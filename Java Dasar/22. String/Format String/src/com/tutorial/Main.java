package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("\nFormat String\n--------");

        //  Bagaimana cara menghasilkan output : Saya adalah Ikhsan

        Scanner inputUser = new Scanner(System.in);


        // Tanpa Format String
        System.out.println("\nTanpa Format String\n--------");
        System.out.print("Masukan Namamu : ");
        String nama = inputUser.next();
        System.out.print("Masukan Umurmu : ");
        int umur = inputUser.nextInt();
        System.out.println("Namamu adalah " + nama + "\nUmurmu adalah " + umur + " tahun");

        System.out.println("\nDengan Format String\n--------");

        // Dengan Format String
            /*  Convertion :
                            String = %s
                            Integer = %d
                            Floating Point,double = %f
                            Boolean = %b
                            Char = %c
            */
        System.out.printf("Nama saya adalah %s \nUmur %s adalah %d tahun \n", nama,nama,umur);

        // Struktur Format = %[argumen_index$][flags][width][.precision]convertion

        String name = "Jono";
        int age = 18;

        System.out.println("\nStruktur Format = ");
        // 1. [argumen_index$]
        System.out.println("1. [argumen_index$]");
            // Output : Jono. Wahai Jono, Kemana saja engkau Jono?
        System.out.printf("%1$s. Wahai %1$s, Kemana saja engkau %1$s?\n", name);
            // Output : Umur Jono Berapa? Jono Menjawab : 18. Wah ternyata masih 18 Tahun
        System.out.printf("\nUmur %1$s Berapa? %1$s Menjawab : %2$d \nWah ternyata masih %2$d Tahun\n", name,age);

        // 2. [flags]
        System.out.println("\n2. [flags]");
        int int1 = 5;
        int int2 = 9;
        int hasil = int1 - int2;
        System.out.printf("%d - %d = %+d\n",int1,int2,hasil); // + itu adalah flags

        // 3. [width]
        System.out.println("\n3. [width]");
        int int3 = 5000;
        System.out.printf("%5d\n", int3); // menggeser ke kanan menjadi 5 angka kekanan
            // jika ditambah [flags]
        System.out.printf("%-20d\n", int3); // if [flags] = "-", artinya rata kiri sebanyak widthnya
        System.out.printf("%+-20d\n", int3); // if [flags] = "+", artinya rata kanan sebanyak widthnya
        System.out.printf("%010d\n",int3); // menambahkan 0 didepannya

        int int4 = 1000000000;
        System.out.printf("%,-13d\n",int4); // menambahkan koma


        // 4. [.precision]
        System.out.println("\n4. [.precision]");

        float float1 = 14.857f;
            // before use [.precision]
        System.out.printf("%f\n",float1);
            // use [.precision]
        System.out.printf("%.1f\n",float1); // membulatkan menjadi 14.9






















    }

}













