package com.tutorial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("\nByte Stream\n--------");
        // Open File
        /*
            Jika di byte stream -> FileInputStream / FileOutputStream
            maka di char stream -> FileReader / FileWriter
        */

        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter charFileOutput = new FileWriter("outputChar.txt");

        // Reading File

            // byte file
            int buffer = byteFileInput.read();

            while (buffer != -1) {
                System.out.print((char) buffer);
                byteFileOutput.write(buffer);
                buffer = byteFileInput.read();
            }

        System.out.println("\n\nChar Stream\n--------");

            // char file
            buffer = charFileInput.read();

            while (buffer != -1) {
                System.out.print((char) buffer);
                charFileOutput.write(buffer);
                buffer = charFileInput.read();
            }

        // Close File
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

        /*  Kesimpulannya, Byte Stream dan Char Stream itu Unbuffered I/O

        tidak direkomendasi, karena setiap akses file, file yg dibaca itu melakukan perulangan
        lewat aplikasi kita. dan itu tidak bagus.
        
        Setelah ini ada Buffered I/O yang lebih baik dari Unbuffered I/o
        */
    }
}
