package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class Main {

    /*  Perbedaan FileInputStream dgn BufferedInputStream yaitu,

            jika FileInputStream itu tidak dibaca / disimpan di memori Main.java nya,
            sedangkan
            BufferedInputStream itu tersimpan di memori Main.java kita
    */

    /*  Kekurangan FileInputStream yaitu dia tidak bisa di reuse / dipakai berulang2,
        jika sudah dipakai sekali, tidak bisa dipakai lagi (hilang)
    */

    public static void main(String[] args) throws IOException {
        long timeStart, timeEnd;

        System.out.println("\nByte Stream VS Buffered Byte Stream\n--------");

        System.out.println("\nByte Stream\n--------");

        // Membaca dari File
            FileInputStream fileInput = new FileInputStream("input.txt");
            System.out.println("Jumlah Karakter file = " + fileInput.available()); // untuk membaca ada berapa character didalam file nya

            // menghitung waktu pembacaan byte stream
            timeStart = System.nanoTime(); // ukuran nano dibawah ms, (sangat cepat)
            System.out.println(fileInput.readAllBytes()); // untuk membaca semua isi file dlm bentuk byte
            timeEnd = System.nanoTime();
            System.out.println("Waktu = " + (timeEnd - timeStart) );
            fileInput.close();

        System.out.println("\nBuffered Byte Stream\n--------");
        // Membaca dari Memory
            FileInputStream byteInput = new FileInputStream("input.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(byteInput);

            bufferedInput.mark(200);
            // menghitung waktu pembacaan buffered byte stream
            timeStart = System.nanoTime();
            System.out.println(bufferedInput.readAllBytes());
            timeEnd = System.nanoTime();
            System.out.println("Waktu = " + (timeEnd - timeStart) + "\n");

            // membaca ulang
            bufferedInput.reset();
            byte[] data = bufferedInput.readAllBytes();
            System.out.println(Arrays.toString(data));
            // Spesial untuk String, ia bisa mengconvert dari byte arrays ke bentuk string
            String dataString = new String(data);
            System.out.println(dataString);

            // close file
            byteInput.close();
            bufferedInput.close();

        // Membuat File Output dengan Buffered Byte Stream
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

            // Write data berupa byte
                // Mengisi data bufferedOutput dari arrays data, dari index 0 sampai panjang data
            bufferedOutput.write(data,0,data.length);
            // jika seperti ini, maka isi data nya tidak langsung muncul ke output.txt, karena
            // disimpan di memori dulu, untuk memunculkan isinya, bisa gunakan flush().
            bufferedOutput.flush(); // muncul isi nya sekarang.

            // close file
            byteOutput.close();
            bufferedOutput.close();
    }
}
