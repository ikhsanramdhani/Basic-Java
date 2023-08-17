package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("\nBuffered Char Stream\n--------\n");

        // Membaca File
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);

        // Membaca lewat String
        String data = bufferedReader.readLine();
        System.out.println(data + "\n");

        bufferedReader.reset();

        // Membaca lewat Arrays Char
        char[] dataChar = new char[data.length()];
        bufferedReader.read(dataChar,0,dataChar.length);
        System.out.println(Arrays.toString(dataChar) + "\n");

        bufferedReader.reset();
        // Membaca Baris pada isi File
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine() + "\n");

        // Write File
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);
        bufferedReader.reset();

            // baris 1
        String barisSatu = bufferedReader.readLine();
        bufferedWriter.write(barisSatu,0,barisSatu.length());
        bufferedWriter.flush();

            // new line / enter
        bufferedWriter.newLine();

            // baris 2
        String barisDua = bufferedReader.readLine();
        bufferedWriter.write(barisDua,0,barisDua.length());
        bufferedWriter.flush();

        // jika tanpa newLine(), maka akan menyatu dengan baris sebelumnya


        // close file
        bufferedWriter.close();
        bufferedReader.close();
        fileOutput.close();
        fileInput.close();

    }
}
