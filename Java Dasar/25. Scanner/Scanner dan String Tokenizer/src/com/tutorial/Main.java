package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        String aku = "Ikhsan";
        int a = 1;
        System.out.printf("\nHai %s %d\n",aku,a);

        System.out.println();

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);
        // System.out.println(scanner.nextLine()); nextLine() untuk membaca isi keseluruhan

        // jika dengan next() saja
        System.out.println(scanner.hasNext()); // cek masih ada / tidak isi char file nya
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.hasNext() + "\n"); // false karena sudah abis

        // Use Delimiter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter("-");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        bufferedReader.reset();
        System.out.println();

        // Mengambil satu baris dengan String tokenizer
        String data = bufferedReader.readLine();
            // get baris pertama
            StringTokenizer stringTokenizer = new StringTokenizer(data,"-");
            while (stringTokenizer.hasMoreTokens()) {
                System.out.println(stringTokenizer.nextToken());
            }
        System.out.println();
            // get baris kedua
            data = bufferedReader.readLine();
            stringTokenizer = new StringTokenizer(data,"-");
            while (stringTokenizer.hasMoreTokens()) {
                System.out.println(stringTokenizer.nextToken());
            }

        // close file
        bufferedReader.close();
        fileInput.close();
        fileInput2.close();
    }
}
