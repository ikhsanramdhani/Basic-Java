package com.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//        MATERI SEBELUMNYA
//        System.out.println(fileInput);
//
//        fileInput = new FileInputStream("input.txt");
//        System.out.println(fileInput);
//        fileInput.close(); // safe agar tidak terjadi tabrak file
//
//        fileInput = new FileInputStream("input2.txt");
//        System.out.println(fileInput);
//        fileInput.close();

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        // Membuka File
        fileInput = new FileInputStream("input.txt");

            /* jadi, .read() itu membaca nilai per characternya / per byte
               Isi dari input.txt = ini ana, jadi hasilnya seperti berikut
             */

            System.out.println("\nMemahami nilai character .read() \n--------");

            // Menginisialisasi File ke variable dan Membaca File
            int data = fileInput.read();

            while(data != -1) { // -1 adalah nilai byte ketika kosong / tanpa isi
                System.out.println((char) data);
                data = fileInput.read();
            }
            //  Jika tidak percaya, bisa System.out.println((char)fileInput.read())
            //  untuk melihat isi dari nilai per character nya

        // Menutup File
        fileInput.close();
        System.out.println();


        // Contoh Skenario Pembukaan File
        try {
            // Membuka File
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");

            // Membaca File
            int buffer = fileInput.read();

            // Menulis File output supaya sama dengan file input
            while (buffer != -1) {
                fileOutput.write(buffer); // ini kuncinya .write()
                buffer = fileInput.read();
            }
            // Cek file output2.txt, maka isinya akan sama dengan input2.txt

        } finally {
            if (fileInput != null) {
                fileInput.close();
            } else if (fileOutput != null) {
                fileInput.close();
            } else {
                System.out.println("Error");
            }
        }

        // Try with Resources
        try (FileInputStream in = new FileInputStream("input.txt")){
            int isi = in.read();

            while(isi != -1) {
                System.out.print((char) isi);
                isi = in.read();
            }
            // Kelebihan try with resources adalah tidak perlu lagi membuat close file
        }

        // Berikut jika ingin menggunakan input output :

        /* try (
                FileInputStream input2 = new FileInputStream("input.txt");
                FileOutputStream output2 = new FileOutputStream("output.txt")
        ) {
            int isi = input2.read();

            while(isi != -1) {
                output2.write((char) isi);
                isi = input2.read();
            }
        } */


    }

}
